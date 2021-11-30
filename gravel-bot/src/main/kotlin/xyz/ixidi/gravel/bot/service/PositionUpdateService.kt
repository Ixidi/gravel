package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterIsInstance
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.bot.position.Position
import xyz.ixidi.gravel.protocol.packet.play.client.ClientTeleportConfirmPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerPositionAndLookPacket

class PositionUpdateService(
    private val bot: GravelBot,
    private val packetsFlow: Flow<Packet>
) : Service() {

    override suspend fun start() {
        packetsFlow
            .filterIsInstance<ServerPlayerPositionAndLookPacket>()
            .collect {
                bot.updatePosition(Position(it.x, it.y, it.z, it.yaw, it.pitch, true))
                bot.send<ClientTeleportConfirmPacket> {
                    teleportId = it.teleportId
                }
            }
    }

}