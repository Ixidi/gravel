package xyz.ixidi.gravel.api.connection

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withTimeoutOrNull
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.Protocol
import java.net.InetSocketAddress
import java.time.Duration
import kotlin.reflect.KClass

/**
 * Basic connection between client and server.
 * It allows to either send or receive packets.
 */
interface Connection {

    /**
     * Local IP address.
     */
    val localAddress: InetSocketAddress

    /**
     * Remote's IP address.
     */
    val remoteAddress: InetSocketAddress

    /**
     * Determines if connection was closed either by local or remote.
     */
    val isClosed: Boolean

    /**
     * Connection's [Protocol]
     */
    val protocol: Protocol

    /**
     * Current connection's state.
     */
    var state: ConnectionState

    /**
     * [SharedFlow] of incoming [Packet]s.
     */
    val incomingPackets: Flow<Packet>

    /**
     * Sends packet to remote.
     * Packet must be registered in connection's [Protocol].
     * @param packet Packet to be sent.
     * @throws UnknownPacketException if [packet] is not registered in connection's [Protocol].
     */
    suspend fun send(packet: Packet)

    /**
     * Enables zlib compression with given threshold.
     * @param threshold positive threshold.
     */
    fun enableCompression(threshold: Int)

    /**
     * Disconnect, closes connection.
     */
    fun close()

}

suspend fun <T : Packet> Connection.send(clazz: KClass<T>, initializer: T.() -> Unit) {
    val packet = protocol.createEmptyPacketImplementation(clazz) ?: throw UnknownPacketException(clazz)
    initializer(packet)
    send(packet)
}

/**
 * Creates empty packet implementing [T] from connection's [Protocol], initializes it with [initializer] and then sends it to remote.
 * Packet must be registered in connection's protocol.
 * @param T Packet's type.
 * @param initializer Packet's body initializer.
 * @throws UnknownPacketException if packet implementing [T] is not registered in connection's [Protocol].
 */
suspend inline fun <reified T : Packet> Connection.send(noinline initializer: T.() -> Unit) {
    send(T::class, initializer)
}

/**
 * Reads one packet from [Connection.incomingPackets] and returns it.
 * If read packet is not [T] or the operation is taking more than [timeout] is returns null.
 * Packet must be registered in connection's protocol.
 * @param T Packet's type.
 * @param timeout Operation's timeout.
 * @return Read packet or null.
 * @throws UnknownPacketException if packet with corresponding [type][T] is not registered in connection's [Protocol].
 */
suspend inline fun <reified T : Packet> Connection.readWithTimeoutOrNull(timeout: Duration): T? {
    protocol.getPacketIdByClass(T::class) ?: throw UnknownPacketException(T::class)
    return withTimeoutOrNull(timeout.toMillis()) {
        incomingPackets.first() as? T
    }
}