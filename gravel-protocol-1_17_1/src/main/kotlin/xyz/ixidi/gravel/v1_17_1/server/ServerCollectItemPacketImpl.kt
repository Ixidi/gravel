
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerCollectItemPacket


class ServerCollectItemPacketImpl : StandardPacket(), ServerCollectItemPacket {
            
	override var collectedEntityId: Int by varInt()
	override var collectorEntityId: Int by varInt()
	override var pickUpItemCount: Int by varInt()
            
}
    