package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.entity.BaseEntity
import xyz.ixidi.gravel.bot.entity.EntityManager
import xyz.ixidi.gravel.bot.position.Position
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityPositionPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityTeleportPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnEntityPacket

class EntityUpdateService(
    private val entityManager: EntityManager,
    private val packetsFlow: Flow<Packet>
) : Service() {

    override suspend fun start() {
        packetsFlow.collect {
            when (it) {
                is ServerSpawnEntityPacket -> {
                    val entity = BaseEntity(it.entityId, it.type, it.objectUUID, Position(it.x, it.y, it.z, it.yaw, it.pitch, true))
                    entityManager.addEntity(entity)
                }
                is ServerEntityPositionPacket -> {
                    val entity = entityManager.getEntity(it.entityId) ?: return@collect
                    val pos = entity.position
                    val newPos = Position(
                        calcFromDelta(it.deltaX, pos.x),
                        calcFromDelta(it.deltaY, pos.y),
                        calcFromDelta(it.deltaZ, pos.z),
                        pos.yaw,
                        pos.pitch,
                        it.onGround
                    )

                    entity.updatePosition(newPos)
                }
                is ServerEntityTeleportPacket -> {
                    val entity = entityManager.getEntity(it.entityId) ?: return@collect
                    entity.updatePosition(Position(it.x, it.y, it.z, it.yaw, it.pitch, it.onGround))
                }
            }
        }
    }

    private fun calcFromDelta(delta: Short, previous: Double) = (delta / 4096.0) + previous

}