package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerEntityTeleportPacket : Packet {

    var entityId: Int
    var x: Double
    var y: Double
    var z: Double
    var yaw: Float
    var pitch: Float
    var onGround: Boolean

}