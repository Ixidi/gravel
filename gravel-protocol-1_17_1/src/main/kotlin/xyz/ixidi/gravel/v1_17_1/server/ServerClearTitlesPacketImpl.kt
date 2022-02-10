
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerClearTitlesPacket


class ServerClearTitlesPacketImpl : StandardPacket(), ServerClearTitlesPacket {
            
	override var reset: Boolean by boolean()
            
}
    