
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUpdateLightPacket


class ServerUpdateLightPacketImpl : StandardPacket(), ServerUpdateLightPacket {
            
	override var chunkX: Int by varInt()
	override var chunkZ: Int by varInt()
	override var trustEdges: Boolean by boolean()
	override var skyLightMask: List<Long> by longList()
	override var blockLightMask: List<Long> by longList()
	override var emptySkyLightMask: List<Long> by longList()
	override var emptyBlockLightMask: List<Long> by longList()
	// override var skyLight: List<List<Long>>
	// override var blockLight: List<List<Long>>
            
}
    