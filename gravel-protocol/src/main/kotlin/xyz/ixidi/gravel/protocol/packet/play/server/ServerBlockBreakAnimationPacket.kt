package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerBlockBreakAnimationPacket : Packet {

    var entityId: Int
    var location: Position
    var destroyStage: Byte

}