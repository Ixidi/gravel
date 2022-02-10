
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientEntityActionPacket


class ClientEntityActionPacketImpl : StandardPacket(), ClientEntityActionPacket {
            
	override var entityId: Int by varInt()
	// override var action: Action
            
}
    