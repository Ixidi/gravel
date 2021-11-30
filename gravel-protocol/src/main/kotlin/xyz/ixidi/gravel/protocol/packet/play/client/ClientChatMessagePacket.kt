package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientChatMessagePacket : Packet {

    var message: String

}