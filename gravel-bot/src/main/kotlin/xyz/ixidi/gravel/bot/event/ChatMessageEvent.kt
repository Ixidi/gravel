package xyz.ixidi.gravel.bot.event

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.bot.GravelBot

data class ChatMessageEvent(override val bot: GravelBot, val text: TextComponent) : Event