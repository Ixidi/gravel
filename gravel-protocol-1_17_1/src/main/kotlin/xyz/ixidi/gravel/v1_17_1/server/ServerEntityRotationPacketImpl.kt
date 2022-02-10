
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityRotationPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerEntityRotationPacketImpl : StandardPacket(), ServerEntityRotationPacket {
            
	override var entityId: Int by varInt()
	override var yaw: Angle by angle()
	override var pitch: Angle by angle()
	override var onGround: Boolean by boolean()
            
}
    