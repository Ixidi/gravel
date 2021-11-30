package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityStatusPacket

class ServerEntityStatusPacketImpl : StandardPacket(), ServerEntityStatusPacket {

    override var entityId: Int by int()
    override var entityStatus: Byte by byte()

}