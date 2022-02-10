
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPongPacket


class ClientPongPacketImpl : StandardPacket(), ClientPongPacket {
            
	override var id: Int by varInt()
            
}
    