
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerExplosionPacket


class ServerExplosionPacketImpl : StandardPacket(), ServerExplosionPacket {
            
	override var x: Float by float()
	override var y: Float by float()
	override var z: Float by float()
	override var strength: Float by float()
	// override var records: List<Record>
	override var playerMotionX: Float by float()
	override var playerMotionY: Float by float()
	override var playerMotionZ: Float by float()
            
}
    