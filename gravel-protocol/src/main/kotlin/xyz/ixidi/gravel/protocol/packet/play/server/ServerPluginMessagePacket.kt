package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.packet.Packet

interface ServerPluginMessagePacket : Packet {

    var channel: Identifier
    var data: ByteArray

}