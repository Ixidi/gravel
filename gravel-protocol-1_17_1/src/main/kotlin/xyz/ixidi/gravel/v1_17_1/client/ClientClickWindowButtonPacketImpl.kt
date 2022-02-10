
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientClickWindowButtonPacket


class ClientClickWindowButtonPacketImpl : StandardPacket(), ClientClickWindowButtonPacket {
            
	override var windowId: Byte by byte()
	override var buttonId: Byte by byte()
            
}
    