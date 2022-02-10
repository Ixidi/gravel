
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityHeadLookPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerEntityHeadLookPacketImpl : StandardPacket(), ServerEntityHeadLookPacket {
            
	override var entityId: Int by varInt()
	override var headYaw: Angle by angle()
            
}
    