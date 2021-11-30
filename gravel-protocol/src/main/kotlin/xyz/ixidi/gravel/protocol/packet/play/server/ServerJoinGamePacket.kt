package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.api.packet.Packet

interface ServerJoinGamePacket : Packet {

    enum class GameMode {
        SURVIVAL,
        CREATIVE,
        ADVENTURE,
        SPECTATOR,
        NONE;
    }

    var entityId: Int
    var isHardcore: Boolean
    var gameMode: GameMode
    var previousGameMode: GameMode
    var worldNames: List<String>
    var dimensionCodec: CompoundTag
    var dimension: CompoundTag
    var worldName: String
    var hashedSeed: Long
    var maxPlayers: Int
    var viewDistance: Int
    var reducedDebugInfo: Boolean
    var enableRespawnScreen: Boolean
    var isDebug: Boolean
    var isFlat: Boolean

}