
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientQueryBlockNBT
import xyz.ixidi.gravel.api.io.Position

class ClientQueryBlockNBTImpl : StandardPacket(), ClientQueryBlockNBT {
            
	override var transactionId: Int by varInt()
	override var location: Position by position()
            
}
    