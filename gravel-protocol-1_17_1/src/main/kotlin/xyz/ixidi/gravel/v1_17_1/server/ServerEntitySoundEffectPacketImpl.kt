
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntitySoundEffectPacket


class ServerEntitySoundEffectPacketImpl : StandardPacket(), ServerEntitySoundEffectPacket {
            
	override var soundId: Int by varInt()
	override var soundCategory: Int by varInt()
	override var entityId: Int by varInt()
	override var volume: Float by float()
	override var pitch: Float by float()
            
}
    