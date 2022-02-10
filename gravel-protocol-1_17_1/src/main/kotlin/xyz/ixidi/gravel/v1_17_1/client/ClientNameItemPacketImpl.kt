
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientNameItemPacket


class ClientNameItemPacketImpl : StandardPacket(), ClientNameItemPacket {
            
	override var itemName: String by string()
            
}
    