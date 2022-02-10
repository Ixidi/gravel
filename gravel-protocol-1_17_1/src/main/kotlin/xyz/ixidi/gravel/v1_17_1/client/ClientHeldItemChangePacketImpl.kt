
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientHeldItemChangePacket


class ClientHeldItemChangePacketImpl : StandardPacket(), ClientHeldItemChangePacket {
            
	override var slot: Short by short()
            
}
    