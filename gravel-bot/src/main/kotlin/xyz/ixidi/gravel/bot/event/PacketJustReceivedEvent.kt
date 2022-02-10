package xyz.ixidi.gravel.bot.event

import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.GravelBot

class PacketJustReceivedEvent(override val bot: GravelBot, val packet: Packet) : Event