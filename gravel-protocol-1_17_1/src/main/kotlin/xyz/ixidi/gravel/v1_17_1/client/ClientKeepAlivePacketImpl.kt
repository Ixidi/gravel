
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientKeepAlivePacket


class ClientKeepAlivePacketImpl : StandardPacket(), ClientKeepAlivePacket {
            
	override var keepAliveId: Long by long()
            
}
    