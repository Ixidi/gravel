package xyz.ixidi.gravel.bot.event

import xyz.ixidi.gravel.api.component.TextComponent

class BotDisconnectedByServerEvent(val reason: TextComponent) : Event