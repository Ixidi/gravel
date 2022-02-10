
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPickItemPacket


class ClientPickItemPacketImpl : StandardPacket(), ClientPickItemPacket {
            
	override var slot: Int by varInt()
            
}
    