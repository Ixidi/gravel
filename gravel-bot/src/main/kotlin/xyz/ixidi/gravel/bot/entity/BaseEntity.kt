package xyz.ixidi.gravel.bot.entity

import xyz.ixidi.gravel.bot.position.Position
import java.util.UUID

class BaseEntity(
    entityId: Int,
    typeId: Int,
    uuid: UUID,
    position: Position
) : Entity(entityId, typeId, uuid, position)