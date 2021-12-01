package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerDifficultyPacket : Packet {

    enum class Difficulty {
        PEACEFUL,
        EASY,
        NORMAL,
        HARD
    }

    var difficulty: Difficulty
    val difficultyLocked: Boolean

}