package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterIsInstance
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.protocol.packet.play.client.ClientKeepAlivePacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerKeepAlivePacket

class KeepAliveService(
    private val bot: GravelBot,
    private val packetsFlow: Flow<Packet>
) : Service() {

    override suspend fun start() {
        packetsFlow.filterIsInstance<ServerKeepAlivePacket>()
            .collect {
                bot.send<ClientKeepAlivePacket> {
                    keepAliveId = it.keepAliveId
                }
            }
    }

}