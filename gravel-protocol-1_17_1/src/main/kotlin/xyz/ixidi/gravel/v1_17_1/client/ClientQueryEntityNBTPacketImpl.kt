
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientQueryEntityNBT


class ClientQueryEntityNBTImpl : StandardPacket(), ClientQueryEntityNBT {
            
	override var transactionId: Int by varInt()
	override var entityId: Int by varInt()
            
}
    