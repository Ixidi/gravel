package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerPluginMessagePacket : Packet {

    var channel: String
    var data: ByteArray

}