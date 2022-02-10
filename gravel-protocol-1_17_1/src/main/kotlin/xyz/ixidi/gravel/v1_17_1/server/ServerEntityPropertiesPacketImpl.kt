
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityPropertiesPacket


class ServerEntityPropertiesPacketImpl : StandardPacket(), ServerEntityPropertiesPacket {
            
	override var entityId: Int by varInt()
	// override var properties: List<Property>
            
}
    