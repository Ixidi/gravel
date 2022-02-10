package xyz.ixidi.gravel.bot.service

import xyz.ixidi.gravel.bot.event.BotTeleportedEvent
import xyz.ixidi.gravel.bot.location.Location
import xyz.ixidi.gravel.protocol.packet.play.client.ClientTeleportConfirmPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerPositionAndLookPacket

class PositionUpdateService : Service() {

    override fun ServiceInitializer.init() {
        on<ServerPlayerPositionAndLookPacket> {
            val newLocation = Location(x, y, z, yaw, pitch, true)
            bot.selfEntity.location = newLocation
            bot.send<ClientTeleportConfirmPacket> {
                teleportId = this@on.teleportId
            }

            bot.eventManager.callEvent(BotTeleportedEvent(newLocation))
        }
    }

}