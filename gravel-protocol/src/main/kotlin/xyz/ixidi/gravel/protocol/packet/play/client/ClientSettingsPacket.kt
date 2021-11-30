package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientSettingsPacket : Packet {

    enum class ChatMode {
        ENABLED,
        COMMANDS_ONLY,
        HIDDEN;
    }

    enum class MainHand {
        LEFT,
        RIGHT;
    }

    var locale: String
    var viewDistance: Byte
    var chatMode: ChatMode
    var chatColors: Boolean
    var displayedSkinPart: UByte
    var mainHand: MainHand
    var disableTextFiltering: Boolean

}