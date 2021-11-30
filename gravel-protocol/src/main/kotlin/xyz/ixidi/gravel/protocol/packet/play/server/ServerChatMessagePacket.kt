package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerChatMessagePacket : Packet {

    enum class Position {
        CHAT,
        SYSTEM_MESSAGE,
        GAME_INFO
    }

    var text: TextComponent
    var position: Position
    val sender: UUID

}