package xyz.ixidi.gravel.v1_17_1.client

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientChatMessagePacket

class ClientChatMessagePacketImpl : StandardPacket(), ClientChatMessagePacket {

    override var message: String by string(256)

}