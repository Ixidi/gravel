
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerRespawnPacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerRespawnPacketImpl : StandardPacket(), ServerRespawnPacket {
            
	// override var dimension: CompoundTag
	override var worldName: Identifier by identifier()
	override var hashedSeed: Long by long()
	// override var gameMode: GameMode
	// override var previousGameMode: GameMode
	override var isDebug: Boolean by boolean()
	override var isFlat: Boolean by boolean()
	override var copyMetadata: Boolean by boolean()
            
}
    