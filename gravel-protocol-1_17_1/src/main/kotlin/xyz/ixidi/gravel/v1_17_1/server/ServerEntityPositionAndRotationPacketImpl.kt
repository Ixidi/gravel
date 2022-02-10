
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityPositionAndRotationPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerEntityPositionAndRotationPacketImpl : StandardPacket(), ServerEntityPositionAndRotationPacket {
            
	override var entityId: Int by varInt()
	override var deltaX: Short by short()
	override var deltaY: Short by short()
	override var deltaZ: Short by short()
	override var yaw: Angle by angle()
	override var pitch: Angle by angle()
	override var onGround: Boolean by boolean()
            
}
    