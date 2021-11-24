package xyz.ixidi.gravel.core

import io.ktor.network.selector.ActorSelectorManager
import io.ktor.network.sockets.aSocket
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withTimeout
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.connection.sendPacket
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.core.connection.ConnectionImpl
import xyz.ixidi.gravel.core.server.GravelServer
import xyz.ixidi.gravel.core.server.GravelServerBuilder
import xyz.ixidi.gravel.packet.status.RequestPacket
import xyz.ixidi.gravel.packet.status.ResponsePacket
import xyz.ixidi.gravel.packet.handshake.HandshakePacket
import xyz.ixidi.gravel.core.status.ServerStatus
import xyz.ixidi.gravel.core.status.status
import xyz.ixidi.gravel.protocol.Protocols
import kotlin.coroutines.CoroutineContext

class Gravel internal constructor(
    private val protocols: List<Protocol>,
    dispatcher: CoroutineDispatcher = Dispatchers.Default
) : CoroutineScope {

    override val coroutineContext: CoroutineContext = SupervisorJob() + dispatcher

    private val aSocket = aSocket(ActorSelectorManager(Dispatchers.IO)).tcp()
    private val json = Json { ignoreUnknownKeys = true }

    suspend fun connect(host: String, port: Int, protocol: Protocol): Connection {
        val socket = aSocket.connect(host, port)
        val connection = ConnectionImpl(protocol, socket, PacketType.SERVER) {  }
        connection.start()
        return connection
    }

    suspend fun fetchStatus(host: String, port: Int, timeout: Long = 3000): ServerStatus {
        val connection = connect(host, port, Protocols.status)

        val result = runCatching {
            connection.sendPacket<HandshakePacket> {
                protocolVersion = -1
                serverAddress = host
                serverPort = port.toUShort()
                nextState = HandshakePacket.NextState.STATUS
            }

            connection.state = ConnectionState.STATUS
            connection.sendPacket<RequestPacket> { }

            withTimeout(timeout) {
                connection.incomingPackets
                    .filterIsInstance<ResponsePacket>()
                    .first()
            }
        }
        connection.close()

        val json = result.getOrThrow().jsonResponse
        return this.json.decodeFromString(json)
    }


    fun server(port: Int, protocol: Protocol, builder: GravelServerBuilder.() -> Unit): GravelServer {
        val server = aSocket.bind(port = port)
        val b = GravelServerBuilder()
        b.builder()

        val gravelServer = GravelServer(server, protocol, b.onNewConnection, b.onDisconnected)
        gravelServer.start()

        return gravelServer
    }

}

fun Gravel(builder: GravelBuilder.() -> Unit): Gravel {
    val b = GravelBuilder()
    builder(b)
    return b.build()
}