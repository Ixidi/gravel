package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Angle
import xyz.ixidi.gravel.api.packet.Packet

interface ServerEntityRotationPacket : Packet {

    var entityId: Int
    var yaw: Angle
    var pitch: Angle
    var onGround: Boolean

}