
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnLivingEntityPacket
import xyz.ixidi.gravel.api.io.Angle

class ServerSpawnLivingEntityPacketImpl : StandardPacket(), ServerSpawnLivingEntityPacket {
            
	override var entityId: Int by varInt()
	override var entityUUID: UUID by uuid()
	override var type: Int //change to enum by varInt()
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var pitch: Angle by angle()
	override var yaw: Angle by angle()
	override var headPitch: Angle by angle()
	override var velocityX: Short by short()
	override var velocityY: Short by short()
	override var velocityZ: Short by short()
            
}
    