
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientEditBookPacket


class ClientEditBookPacketImpl : StandardPacket(), ClientEditBookPacket {
            
	override var offHand: Boolean by boolean()
	override var pages: List<String> by stringList()
	// override var title: String?
            
}
    