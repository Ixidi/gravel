package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientPlayerPositionAndRotationPacket : Packet {

    var x: Double
    var feetY: Double
    var z: Double
    var yaw: Float
    var pitch: Float
    var onGround: Boolean

}