
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerAcknowledgePlayerDiggingPacket
import xyz.ixidi.gravel.api.io.Position

class ServerAcknowledgePlayerDiggingPacketImpl : StandardPacket(), ServerAcknowledgePlayerDiggingPacket {
            
	override var location: Position by position()
	override var block: Int by varInt()
	// override var status: Status
	override var successful: Boolean by boolean()
            
}
    