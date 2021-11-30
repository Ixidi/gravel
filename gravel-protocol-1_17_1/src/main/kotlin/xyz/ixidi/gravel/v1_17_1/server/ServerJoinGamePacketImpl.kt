package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.server.ServerJoinGamePacket

class ServerJoinGamePacketImpl : StandardPacket(), ServerJoinGamePacket {

    override var entityId: Int by int()
    override var isHardcore: Boolean by boolean()

    override var gameMode: ServerJoinGamePacket.GameMode by byte().mapped(
        convertFrom = {
            when (it) {
                ServerJoinGamePacket.GameMode.SURVIVAL -> 0
                ServerJoinGamePacket.GameMode.CREATIVE -> 1
                ServerJoinGamePacket.GameMode.ADVENTURE -> 2
                ServerJoinGamePacket.GameMode.SPECTATOR -> 3
                else -> throw Exception("Unknown gameMode")
            }
        },
        convertTo = {
            when (it.toInt()) {
                0 -> ServerJoinGamePacket.GameMode.SURVIVAL
                1 -> ServerJoinGamePacket.GameMode.CREATIVE
                2 -> ServerJoinGamePacket.GameMode.ADVENTURE
                3 -> ServerJoinGamePacket.GameMode.SPECTATOR
                else -> throw Exception("Unknown gameMode")
            }
        }
    )

    override var previousGameMode: ServerJoinGamePacket.GameMode by byte().mapped(
    convertFrom = {
        when (it) {
            ServerJoinGamePacket.GameMode.NONE -> -1
            ServerJoinGamePacket.GameMode.SURVIVAL -> 0
            ServerJoinGamePacket.GameMode.CREATIVE -> 1
            ServerJoinGamePacket.GameMode.ADVENTURE -> 2
            ServerJoinGamePacket.GameMode.SPECTATOR -> 3
            else -> throw Exception("Unknown gameMode")
        }
    },
    convertTo = {
        when (it.toInt()) {
            -1 -> ServerJoinGamePacket.GameMode.NONE
            0 -> ServerJoinGamePacket.GameMode.SURVIVAL
            1 -> ServerJoinGamePacket.GameMode.CREATIVE
            2 -> ServerJoinGamePacket.GameMode.ADVENTURE
            3 -> ServerJoinGamePacket.GameMode.SPECTATOR
            else -> throw Exception("Unknown gameMode")
        }
    }

    )
    override var worldNames: List<String> by stringList()
    override var dimensionCodec: CompoundTag by nbtCompound()
    override var dimension: CompoundTag by nbtCompound()
    override var worldName: String by string()
    override var hashedSeed: Long by long()
    override var maxPlayers: Int by varInt()
    override var viewDistance: Int by varInt()
    override var reducedDebugInfo: Boolean by boolean()
    override var enableRespawnScreen: Boolean by boolean()
    override var isDebug: Boolean by boolean()
    override var isFlat: Boolean by boolean()

}