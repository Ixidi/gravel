package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPluginMessagePacket

class ServerPluginMessagePacketImpl : StandardPacket(), ServerPluginMessagePacket {

    override var channel: String by string()

    override var data: ByteArray by field(
        read = { readAll() },
        write = { writeFully(it) }
    )

}