package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerKeepAlivePacket

class ServerKeepAlivePacketImpl : StandardPacket(), ServerKeepAlivePacket {

    override var keepAliveId: Long by long()

}