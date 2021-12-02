package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Angle
import xyz.ixidi.gravel.api.packet.Packet

interface ServerEntityPositionAndRotationPacket : Packet {

    var entityId: Int
    var deltaX: Short
    var deltaY: Short
    var deltaZ: Short
    var yaw: Angle
    var pitch: Angle
    var onGround: Boolean

}