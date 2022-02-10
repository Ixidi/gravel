
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientInteractEntityPacket


class ClientInteractEntityPacketImpl : StandardPacket(), ClientInteractEntityPacket {
            
	override var entityId: Int by varInt()
	// override var operation: Operation
	override var sneaking: Boolean by boolean()
            
}
    