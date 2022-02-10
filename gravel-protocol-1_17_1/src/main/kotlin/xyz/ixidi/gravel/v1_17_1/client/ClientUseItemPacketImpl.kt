
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUseItemPacket


class ClientUseItemPacketImpl : StandardPacket(), ClientUseItemPacket {
            
	override var offHand: Boolean by boolean()
            
}
    