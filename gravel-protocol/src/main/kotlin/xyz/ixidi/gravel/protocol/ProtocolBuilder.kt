package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.dsl.GravelDsl
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.api.packet.Protocol

@GravelDsl
class ProtocolBuilder internal constructor(private val version: Int) {

    private val packetSetBuilders = HashMap<PacketType, PacketTypeBuilder>()

    /**
     * Creates section for registering packets with specified type.
     * If function is called twice with the same [type] the second one overrides first.
     */
    private fun type(type: PacketType, builder: PacketTypeBuilder.() -> Unit) {
        val b = PacketTypeBuilder(type)
        builder(b)
        packetSetBuilders[type] = b
    }

    /**
     * Creates section for registering packets sent by client.
     * If function is called twice second set overrides first.
     */
    fun client(builder: PacketTypeBuilder.() -> Unit) = type(PacketType.CLIENT, builder)

    /**
     * Creates section for registering packets sent by server.
     * If function is called twice second set overrides first.
     */
    fun server(builder: PacketTypeBuilder.() -> Unit) = type(PacketType.SERVER, builder)

    internal fun build(): Protocol =
        ProtocolImpl(
            version,
            packetSetBuilders
                .values
                .map { it.build() }
                .flatten()
        )

}
