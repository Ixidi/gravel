package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.server.ServerChatMessagePacket
import java.util.UUID

class ServerChatMessagePacketImpl : StandardPacket(), ServerChatMessagePacket {

    override var text: TextComponent by textComponent(262144 / 4)

    override var position: ServerChatMessagePacket.Position by byte().mapped(
        convertFrom = {
            when (it) {
                ServerChatMessagePacket.Position.CHAT -> 0
                ServerChatMessagePacket.Position.SYSTEM_MESSAGE -> 1
                ServerChatMessagePacket.Position.GAME_INFO -> 2
            }
        },
        convertTo = {
            when (it.toInt()) {
                0 -> ServerChatMessagePacket.Position.CHAT
                1 -> ServerChatMessagePacket.Position.SYSTEM_MESSAGE
                2 -> ServerChatMessagePacket.Position.GAME_INFO
                else -> ServerChatMessagePacket.Position.CHAT //TODO
            }
        }
    )

    override val sender: UUID by uuid()

}