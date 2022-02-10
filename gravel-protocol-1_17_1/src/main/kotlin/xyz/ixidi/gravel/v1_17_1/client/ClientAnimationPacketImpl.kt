
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientAnimationPacket


class ClientAnimationPacketImpl : StandardPacket(), ClientAnimationPacket {
            
	override var mainHand: Boolean by boolean()
            
}
    