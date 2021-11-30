package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientPluginMessagePacket : Packet {

    var channel: String
    var data: ByteArray

}