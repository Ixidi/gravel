package xyz.ixidi.gravel.api.connection

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.Protocol

/**
 * Basic connection between client and server.
 * It allows to either send or receive packets.
 */
interface Connection {

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
    suspend fun sendPacket(packet: Packet)


    /**
     * Disconnect, closes connection.
     */
    fun close()

}

/**
 * Creates empty packet from connection's [Protocol], initializes it with [initializer] and then sends it to remote.
 * Packet must be registered in connection's protocol.
 * @param T Packet's type.
 * @param initializer Packet's body initializer.
 * @throws UnknownPacketException if packet with corresponding [type][T] is not registered in connection's [Protocol].
 */
suspend inline fun <reified T : Packet> Connection.sendPacket(initializer: T.() -> Unit) {
    val packet = protocol.createEmptyPacketFromClass(T::class) ?: throw UnknownPacketException(T::class)
    initializer(packet)
    sendPacket(packet)
}