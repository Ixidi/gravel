package xyz.ixidi.gravel.core.connection

import io.ktor.network.sockets.Socket
import io.ktor.network.sockets.openReadChannel
import io.ktor.network.sockets.openWriteChannel
import io.ktor.util.toByteArray
import io.ktor.utils.io.ByteChannel
import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.close
import io.ktor.utils.io.readFully
import io.ktor.utils.io.writeFully
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import mu.KotlinLogging
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.api.connection.UnknownPacketException
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.core.io.asDataReader
import xyz.ixidi.gravel.core.io.asDataWriter
import xyz.ixidi.gravel.core.io.readVarInt
import xyz.ixidi.gravel.core.io.writeVarInt
import xyz.ixidi.gravel.core.util.byteSizeAsVarInt
import java.net.InetSocketAddress
import kotlin.coroutines.CoroutineContext

private val logger = KotlinLogging.logger { }

internal class ConnectionImpl(
    override val protocol: Protocol,
    private val socket: Socket,
    private val receivedPacketsType: PacketType,
    private val onDisconnected: (Connection) -> Unit,
    context: CoroutineContext
) : Connection, CoroutineScope {

    override val coroutineContext: CoroutineContext = context + SupervisorJob()
    override val localAddress: InetSocketAddress = socket.localAddress as InetSocketAddress
    override val remoteAddress: InetSocketAddress = socket.remoteAddress as InetSocketAddress

    override var isClosed: Boolean = false
        private set

    override var state: ConnectionState = ConnectionState.HANDSHAKE

    override lateinit var incomingPackets: Flow<Packet>
        private set

    private var started = false

    private val readMutex = Mutex()
    private val outgoingPackets = Channel<Pair<Packet, Int>>(capacity = Channel.UNLIMITED)
    private val readChannel = socket.openReadChannel()
    private val writeChannel = socket.openWriteChannel(true)

    /**
     * Compression threshold, -1 means disabled.
     */
    private var threshold = -1

    private val isCompressionEnabled: Boolean
        get() = threshold != -1

    /**
     * Starts this connection, can be started only once.
     */
    fun start() {
        if (started) throw Exception("Connection has already been started.")

        launch {
            while (true) {
                val p = outgoingPackets.receive()
                runCatching {
                    writeChannel.writePacket(p.second, p.first)
                }.onFailure {
                    logger.catching(it)
                    close()
                }
            }
        }

        incomingPackets = flow {
            while (!isClosed) {
                runCatching {
                    readChannel.readPacket()
                }.onSuccess {
                    emit(it)
                }.onFailure {
                    println(it.stackTraceToString())
                    close()
                }
            }
        }

        started = true
    }

    override suspend fun send(packet: Packet) {
        if (!started) throw Exception("Connection has not been started.")

        val id = if (packet is RawPacket)
            packet.id
        else
            protocol.getPacketIdByClass(packet::class) ?: throw UnknownPacketException(packet::class)

        outgoingPackets.send(packet to id)
    }

    private suspend fun ByteReadChannel.readPacket(): Packet {
        readMutex.withLock {
            val size = readVarInt()

            val data = if (isCompressionEnabled) {
                val dataSize = readVarInt()
                if (dataSize > 0) {
                    if (dataSize < threshold) throw Exception("Badly compressed packet.")

                    val compressed = ByteArray(size - dataSize.byteSizeAsVarInt)
                    readFully(compressed)

                    compressed.decompress()
                } else {
                    val body = ByteArray(size - 1)
                    readFully(body)

                    body
                }
            } else {
                val body = ByteArray(size)
                readFully(body)

                body
            }

            val dataChannel = ByteReadChannel(data)
            val id = dataChannel.readVarInt()
            val packet = protocol.getPacketById(state, receivedPacketsType, id) ?: RawPacket(id, state)

            val dataReader = dataChannel.asDataReader()
            packet.run { dataReader.read() }

            return packet
        }
    }

    private suspend fun ByteWriteChannel.writePacket(id: Int, packet: Packet) {
        val dataChannel = ByteChannel(true)
        val dataWriter = dataChannel.asDataWriter()

        dataWriter.writeVarInt(id)
        packet.run { dataWriter.write() }
        dataChannel.close()

        val dataBytes = dataChannel.toByteArray()
        val dataSize = dataBytes.size
        if (!isCompressionEnabled) {
            //compression disabled
            writeVarInt(dataSize)
            writeFully(dataBytes)
            return
        }

        if (dataSize < threshold) {
            //compression enabled, data size below server threshold
            writeVarInt(dataSize + 1) //one byte for DataLength, 0
            writeVarInt(0)
            writeFully(dataBytes)
            return
        }

        //with compression
        val compressedData = dataBytes.compress()
        val compressedDataSize = compressedData.size

        writeVarInt(compressedDataSize + compressedDataSize.byteSizeAsVarInt)
        writeVarInt(compressedDataSize)
        writeFully(compressedData)
    }

    override fun enableCompression(threshold: Int) {
        if (threshold <= 0) throw Exception("Non-positive threshold.")

        this.threshold = threshold
    }

    override fun close() {
        if (isClosed) return
        isClosed = true
        cancel()
        socket.close()
        onDisconnected(this)
    }
}