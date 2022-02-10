
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUpdateViewPositionPacket


class ServerUpdateViewPositionPacketImpl : StandardPacket(), ServerUpdateViewPositionPacket {
            
	override var chunkX: Int by varInt()
	override var chunkZ: Int by varInt()
            
}
    