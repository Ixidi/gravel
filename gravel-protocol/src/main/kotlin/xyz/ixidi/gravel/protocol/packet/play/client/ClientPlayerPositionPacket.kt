package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientPlayerPositionPacket : Packet {

    var x: Double
    var y: Double
    var z: Double
    var onGround: Boolean

}