
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUpdateViewDistancePacket


class ServerUpdateViewDistancePacketImpl : StandardPacket(), ServerUpdateViewDistancePacket {
            
	override var viewDistance: Int by varInt()
            
}
    