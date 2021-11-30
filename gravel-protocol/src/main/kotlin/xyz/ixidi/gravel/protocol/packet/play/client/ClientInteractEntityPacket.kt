package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientInteractEntityPacket : Packet {

    enum class InteractionType {
        INTERACT,
        ATTACK,
        INTERACT_AI
    }

    enum class Hand {
        MAIN,
        OFF
    }

    var entityId: Int
    var type: InteractionType
    var targetX: Float?
    var targetY: Float?
    var targetZ: Float?
    var hand: Hand?
    var sneaking: Boolean


}