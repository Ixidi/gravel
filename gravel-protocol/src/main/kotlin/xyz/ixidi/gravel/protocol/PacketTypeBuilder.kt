package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.dsl.GravelDsl
import xyz.ixidi.gravel.api.packet.PacketType

@GravelDsl
class PacketTypeBuilder internal constructor(
    private val type: PacketType
) {

    private val packetSetBuilders = HashMap<ConnectionState, PacketSetBuilder>()

    /**
     * Creates section for registering packets at specified connection state.
     * If function is called twice with the same [state] second set overrides first.
     */
    private fun state(state: ConnectionState, builder: PacketSetBuilder.() -> Unit) {
        val b = PacketSetBuilder(state, type)
        builder(b)
        packetSetBuilders[state] = b
    }

    /**
     * Creates section for registering handshake packets.
     * If function is called twice second set overrides first.
     */
    fun handshake(builder: PacketSetBuilder.() -> Unit) = state(ConnectionState.HANDSHAKE, builder)

    /**
     * Creates section for registering login state packets.
     * If function is called twice second set overrides first.
     */
    fun login(builder: PacketSetBuilder.() -> Unit) = state(ConnectionState.LOGIN, builder)

    /**
     * Creates section for registering status state packets.
     * If function is called twice second set overrides first.
     */
    fun status(builder: PacketSetBuilder.() -> Unit) = state(ConnectionState.STATUS, builder)

    /**
     * Creates section for registering play state packets.
     * If function is called twice second set overrides first.
     */
    fun play(builder: PacketSetBuilder.() -> Unit) = state(ConnectionState.PLAY, builder)

    internal fun build() =
        packetSetBuilders
            .values
            .map { it.build() }
            .flatten()

}