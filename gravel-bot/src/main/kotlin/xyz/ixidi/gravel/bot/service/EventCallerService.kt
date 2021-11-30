package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.bot.event.ChatMessageEvent
import xyz.ixidi.gravel.bot.event.Event
import xyz.ixidi.gravel.bot.event.PacketReceivedEvent
import xyz.ixidi.gravel.protocol.packet.play.server.ServerChatMessagePacket

class EventCallerService(
    private val bot: GravelBot,
    private val eventsFlow: MutableSharedFlow<Event>,
    private val packetsFlow: Flow<Packet>
) : Service() {

    override suspend fun start() {
        packetsFlow.collect {
            eventsFlow.emit(PacketReceivedEvent(bot, it))
            when (it) {
                is ServerChatMessagePacket -> {
                    eventsFlow.emit(ChatMessageEvent(bot, it.text))
                }
            }
        }
    }

}