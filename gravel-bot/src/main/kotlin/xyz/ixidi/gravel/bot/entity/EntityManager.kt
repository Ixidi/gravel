package xyz.ixidi.gravel.bot.entity

class EntityManager {

    private val entities = ArrayList<Entity>()

    internal fun addEntity(entity: Entity) {
        if (entities.any { it.entityId == entity.entityId }) throw Exception("Entity with this name is already registered.")

        entities.add(entity)
    }

    internal fun removeEntity(entity: Entity) {
        if (!entities.remove(entity)) throw Exception("Entity is not registered.")
    }

    fun getEntity(id: Int) = entities.firstOrNull { it.entityId == id }

    fun getAllEntities() = entities.toList()

}