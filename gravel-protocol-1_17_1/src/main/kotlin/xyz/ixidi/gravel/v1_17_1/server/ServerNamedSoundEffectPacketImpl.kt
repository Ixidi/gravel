
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerNamedSoundEffectPacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerNamedSoundEffectPacketImpl : StandardPacket(), ServerNamedSoundEffectPacket {
            
	override var soundName: Identifier by identifier()
	override var soundCategory: Int by varInt()
	override var effectPositionX: Int by varInt()
	override var effectPositionY: Int by varInt()
	override var effectPositionZ: Int by varInt()
	override var volume: Float by float()
	override var pitch: Float by float()
            
}
    