package xyz.ixidi.gravel.v1_17_1.client

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSettingsPacket

class ClientSettingsPacketImpl : StandardPacket(), ClientSettingsPacket {

    override var locale: String by string(16)

    override var viewDistance: Byte by byte()

    override var chatMode: ClientSettingsPacket.ChatMode by varInt().mapped(
        convertTo = {
            when (it) {
                0 -> ClientSettingsPacket.ChatMode.ENABLED
                1 -> ClientSettingsPacket.ChatMode.COMMANDS_ONLY
                2 -> ClientSettingsPacket.ChatMode.HIDDEN
                else -> throw Exception("Unknown id.")
            }
        },
        convertFrom = {
            when (it) {
                ClientSettingsPacket.ChatMode.ENABLED -> 0
                ClientSettingsPacket.ChatMode.COMMANDS_ONLY -> 1
                ClientSettingsPacket.ChatMode.HIDDEN -> 2
            }
        }
    )

    override var chatColors: Boolean by boolean()

    override var displayedSkinPart: UByte by uByte()

    override var mainHand: ClientSettingsPacket.MainHand by varInt().mapped(
        convertTo = {
            when (it) {
                0 -> ClientSettingsPacket.MainHand.LEFT
                1 -> ClientSettingsPacket.MainHand.RIGHT
                else -> throw Exception("Unknown.")
            }
        },
        convertFrom = {
            when (it) {
                ClientSettingsPacket.MainHand.LEFT -> 0
                ClientSettingsPacket.MainHand.RIGHT -> 1
            }
        }
    )

    override var disableTextFiltering: Boolean by boolean()

}