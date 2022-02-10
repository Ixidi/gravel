
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerDestroyEntitiesPacket


class ServerDestroyEntitiesPacketImpl : StandardPacket(), ServerDestroyEntitiesPacket {
            
	override var entityIds: List<Int> by varIntList()
            
}
    