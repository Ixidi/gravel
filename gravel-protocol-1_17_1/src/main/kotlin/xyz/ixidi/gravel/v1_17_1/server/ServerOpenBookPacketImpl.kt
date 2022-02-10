
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerOpenBookPacket


class ServerOpenBookPacketImpl : StandardPacket(), ServerOpenBookPacket {
            
	override var mainHand: Boolean by boolean()
            
}
    