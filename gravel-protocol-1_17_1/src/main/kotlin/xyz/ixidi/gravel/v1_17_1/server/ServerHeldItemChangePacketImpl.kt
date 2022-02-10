
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerHeldItemChangePacket


class ServerHeldItemChangePacketImpl : StandardPacket(), ServerHeldItemChangePacket {
            
	override var slot: Byte by byte()
            
}
    