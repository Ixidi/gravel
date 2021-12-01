package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerBlockActionPacket : Packet {

    var location: Position
    var actionId: UByte
    var actionParam: UByte
    var blockType: Int

}