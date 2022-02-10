
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnEntityPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerSpawnEntityPacketImpl : StandardPacket(), ServerSpawnEntityPacket {
            
	override var entityId: Int by varInt()
	override var objectUUID: UUID by uuid()
	override var type: Int //change to enum by varInt()
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var pitch: Angle by angle()
	override var yaw: Angle by angle()
	override var data: Int by varInt()
	override var velocityX: Short by short()
	override var velocityY: Short by short()
	override var velocityZ: Short by short()
            
}
    