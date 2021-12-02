package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID
import kotlin.reflect.KClass

interface ServerPlayerInfoPacket : Packet {

    sealed interface Action {

        class AddPlayer(
            val name: String,
            val properties: List<Property>,
            val gameMode: Int,
            val ping: Int,
            val displayName: TextComponent?
        ) : Action {

            data class Property(
                val name: String,
                val value: String,
                val signature: String?
            )

        }
        class UpdateGameMode(val gameMode: Int) : Action
        class UpdateLatency(val ping: Int) : Action
        class UpdateDisplayName(val displayName: String?) : Action
        object RemovePlayer : Action

    }

    data class Player(
        val uuid: UUID,
        val action: Action
    )

    val action: KClass<Action>
    val players: List<Player>

}