
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerBlockChangePacket
import xyz.ixidi.gravel.api.io.Position

class ServerBlockChangePacketImpl : StandardPacket(), ServerBlockChangePacket {
            
	override var location: Position by position()
	override var blockId: Int by varInt()
            
}
    