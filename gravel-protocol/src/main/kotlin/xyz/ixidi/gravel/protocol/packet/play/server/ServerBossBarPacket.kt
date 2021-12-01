package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerBossBarPacket : Packet {

    enum class Color(val value: Int) {
        PINK(0),
        BLUE(1),
        RED(2),
        GREEN(3),
        YELLOW(4),
        PURPLE(5),
        WHITE(6)
    }

    enum class Dividers(val value: Int) {
        NONE(0),
        NOTCHES_6(1),
        NOTCHES_10(2),
        NOTCHES_12(3),
        NOTCHES_20(4)
    }

    sealed class Action {

        class Add(
            val title: TextComponent,
            val health: Float,
            val color: Color,
            val division: Dividers,
            val flags: UByte
        ) : Action()

        object Remove : Action()

        class UpdateHealth(
            val health: Float
        ) : Action()

        class UpdateTitle(
            val title: TextComponent
        ) : Action()

        class UpdateStyle(
            val color: Color,
            val divider: Dividers
        ) : Action()

        class UpdateFlags(
            val flags: UByte
        ) : Action()

    }

    var uuid: UUID
    var action: Action

}