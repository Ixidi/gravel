package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerEntityPositionPacket : Packet {

    var entityId: Int
    var deltaX: Short
    var deltaY: Short
    var deltaZ: Short
    var onGround: Boolean

}