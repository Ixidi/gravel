package xyz.ixidi.gravel.bot.player

import xyz.ixidi.gravel.bot.entity.LivingEntity
import xyz.ixidi.gravel.bot.location.Location
import xyz.ixidi.gravel.bot.location.Vector
import java.util.UUID

class PlayerEntity(
    entityId: Int,
    uuid: UUID,
    location: Location,
    headPitch: Float,
    velocity: Vector,
    val name: String
) : LivingEntity(entityId, 111, uuid, location, headPitch, velocity)