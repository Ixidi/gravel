
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityTeleportPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerEntityTeleportPacketImpl : StandardPacket(), ServerEntityTeleportPacket {
            
	override var entityId: Int by varInt()
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var yaw: Angle by angle()
	override var pitch: Angle by angle()
	override var onGround: Boolean by boolean()
            
}
    