
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerJoinGamePacket


class ServerJoinGamePacketImpl : StandardPacket(), ServerJoinGamePacket {
            
	override var entityId: Int by varInt()
	override var isHardcore: Boolean by boolean()
	// override var gameMode: GameMode
	// override var previousGameMode: GameMode
	override var worldNames: List<String> by stringList()
	// override var dimensionCodec: CompoundTag
	// override var dimension: CompoundTag
	override var worldName: String by string()
	override var hashedSeed: Long by long()
	override var maxPlayers: Int by varInt()
	override var viewDistance: Int by varInt()
	override var reducedDebugInfo: Boolean by boolean()
	override var enableRespawnScreen: Boolean by boolean()
	override var isDebug: Boolean by boolean()
	override var isFlat: Boolean by boolean()
            
}
    