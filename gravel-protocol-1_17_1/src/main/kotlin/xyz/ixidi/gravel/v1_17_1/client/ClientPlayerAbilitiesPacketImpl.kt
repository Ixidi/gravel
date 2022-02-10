
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerAbilitiesPacket


class ClientPlayerAbilitiesPacketImpl : StandardPacket(), ClientPlayerAbilitiesPacket {
            
	override var isFlying: Boolean by boolean()
            
}
    