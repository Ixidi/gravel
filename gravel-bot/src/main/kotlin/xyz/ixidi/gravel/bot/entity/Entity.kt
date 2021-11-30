package xyz.ixidi.gravel.bot.entity

import xyz.ixidi.gravel.bot.position.Position
import java.util.UUID

abstract class Entity(
    val entityId: Int,
    val typeId: Int,
    val uuid: UUID,
    position: Position
) {

    var position: Position = position
    private set

    internal fun updatePosition(position: Position) {
        this.position = position
    }

}