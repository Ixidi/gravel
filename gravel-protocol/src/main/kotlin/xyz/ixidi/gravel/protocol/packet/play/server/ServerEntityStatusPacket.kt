package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerEntityStatusPacket : Packet {

    var entityId: Int
    var entityStatus: Byte

}