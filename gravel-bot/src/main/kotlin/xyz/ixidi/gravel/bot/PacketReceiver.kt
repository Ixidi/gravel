package xyz.ixidi.gravel.bot

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.packet.Packet

class PacketReceiver(
    private val bot: GravelBot,
    private val connection: Connection,
    private val receivedPackets: MutableSharedFlow<Packet>
) {

    suspend fun startReceiving() {
        connection.incomingPackets.collect {
            receivedPackets.emit(it)
            /*when (it) {
                is ServerChatMessagePacket -> {
                    eventsFlow.emit(ChatMessageEvent(bot, it.text))
                }
                is ServerJoinGamePacket -> {
                    println(it)
                    connection.send<ClientPluginMessagePacket> {
                        channel = "minecraft:vanilla"
                        data = "vanilla".toByteArray()
                    }
                    connection.send<ClientSettingsPacket> {
                        locale = "en_GB"
                        viewDistance = 5
                        chatMode = ClientSettingsPacket.ChatMode.ENABLED
                        chatColors = true
                        displayedSkinPart = 0.toUByte()
                        mainHand = ClientSettingsPacket.MainHand.RIGHT
                        disableTextFiltering = true
                    }
                }
                is ServerKeepAlivePacket -> {
                    connection.send<ClientKeepAlivePacket> {
                        keepAliveId = it.keepAliveId
                    }
                }
            }*/
        }
    }
}