package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet

interface ServerTabCompletePacket : Packet {

    data class Match(
        val value: String,
        val tooltip: TextComponent?
    )

    var id: Int
    var start: Int
    var length: Int
    var matches: List<Match>

}