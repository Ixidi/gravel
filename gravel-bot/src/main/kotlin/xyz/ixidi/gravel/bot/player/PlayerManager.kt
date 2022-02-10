package xyz.ixidi.gravel.bot.entity

import xyz.ixidi.gravel.bot.player.PlayerEntity
import java.util.UUID

class EntityManager {

    private val entities = ArrayList<Entity>()

    internal fun addEntity(entity: Entity) {
        entities.removeIf { it.entityId == entity.entityId }

        entities.add(entity)
    }

    internal fun removeEntity(entity: Entity) {
        if (!entities.remove(entity)) throw Exception("Entity is not registered.")
    }

    fun getEntity(id: Int) = entities.firstOrNull { it.entityId == id }

    fun getAllEntities() = entities.toList()

    fun getPlayerEntity(uuid: UUID) = entities.firstOrNull { it is PlayerEntity && it.uuid == uuid } as PlayerEntity?
    fun getPlayerEntity(name: String) = entities.firstOrNull { it is PlayerEntity && it.name.equals(name, true) } as PlayerEntity?

}