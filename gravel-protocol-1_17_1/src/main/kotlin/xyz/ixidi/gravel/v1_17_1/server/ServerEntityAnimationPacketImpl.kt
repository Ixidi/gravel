
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityAnimationPacket


class ServerEntityAnimationPacketImpl : StandardPacket(), ServerEntityAnimationPacket {
            
	override var entityId: Int by varInt()
	// override var animation: Animation
            
}
    