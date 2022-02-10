
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerAbilitiesPacket


class ServerPlayerAbilitiesPacketImpl : StandardPacket(), ServerPlayerAbilitiesPacket {
            
	override var invulnerable: Boolean by boolean()
	override var flying: Boolean by boolean()
	override var allowFlying: Boolean by boolean()
	override var creativeMode: Boolean by boolean()
	override var flyingSpeed: Float by float()
	override var fieldOfView: Float by float()
            
}
    