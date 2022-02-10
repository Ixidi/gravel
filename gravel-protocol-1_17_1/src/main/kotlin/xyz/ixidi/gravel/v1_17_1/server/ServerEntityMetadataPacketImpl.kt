
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityMetadataPacket


class ServerEntityMetadataPacketImpl : StandardPacket(), ServerEntityMetadataPacket {
            
	override var entityId: Int by varInt()
	// override var entityMetadata: Any //TODO implement entitymetadata type
            
}
    