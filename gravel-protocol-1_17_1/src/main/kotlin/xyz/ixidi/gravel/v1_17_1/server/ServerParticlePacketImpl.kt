
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerParticlePacket


class ServerParticlePacketImpl : StandardPacket(), ServerParticlePacket {
            
	// override var particle: Particle
	override var longDistance: Boolean by boolean()
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var offsetX: Float by float()
	override var offsetY: Float by float()
	override var offsetZ: Float by float()
	override var particleData: Float by float()
	override var particleCount: Int by varInt()
            
}
    