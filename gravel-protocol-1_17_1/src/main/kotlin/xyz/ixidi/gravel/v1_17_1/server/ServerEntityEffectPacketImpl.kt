
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityEffectPacket


class ServerEntityEffectPacketImpl : StandardPacket(), ServerEntityEffectPacket {
            
	override var entityId: Int by varInt()
	override var effectId: Byte by byte()
	override var amplifier: Byte by byte()
	override var duration: Int by varInt()
	override var isAmbient: Boolean by boolean()
	override var showParticles: Boolean by boolean()
	override var showIcon: Boolean by boolean()
            
}
    