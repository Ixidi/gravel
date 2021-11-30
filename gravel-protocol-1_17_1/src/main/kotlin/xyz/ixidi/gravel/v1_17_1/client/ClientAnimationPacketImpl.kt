package xyz.ixidi.gravel.v1_17_1.client

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.client.ClientAnimationPacket

class ClientAnimationPacketImpl : StandardPacket(), ClientAnimationPacket {

    override var mainHand: Boolean by varInt().mapped(
        convertFrom = { if (it) 0 else 1 },
        convertTo = { when (it) {
            0 -> true
            1 -> false
            else -> throw Exception("Unknown id.")
        } }
    )

}