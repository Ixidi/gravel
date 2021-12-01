package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerBlockChangePacket : Packet {

    var location: Position
    var blockId: Int

}