
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientTabCompletePacket


class ClientTabCompletePacketImpl : StandardPacket(), ClientTabCompletePacket {
            
	override var transactionId: Int by varInt()
	override var text: String by string()
            
}
    