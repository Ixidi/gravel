package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerPlayerAbilitiesPacket : Packet {

    var invulnerable: Boolean
    var flying: Boolean
    var allowFlying: Boolean
    var creativeMode: Boolean
    var flyingSpeed: Float
    var fieldOfView: Float

}