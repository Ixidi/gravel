package xyz.ixidi.gravel.bot.event

import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.bot.entity.Entity
import xyz.ixidi.gravel.bot.location.Location

class EntityLocationChangedEvent(val entity: Entity, val from: Location, val to: Location) : Event