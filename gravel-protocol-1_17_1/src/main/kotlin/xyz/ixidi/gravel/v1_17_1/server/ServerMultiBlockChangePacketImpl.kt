
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerMultiBlockChangePacket


class ServerMultiBlockChangePacketImpl : StandardPacket(), ServerMultiBlockChangePacket {
            
	override var chunkSection: Long by long()
	override var inverseLightUpdateTrustEdges: Boolean by boolean()
	override var blocks: List<Long> by longList()
            
}
    