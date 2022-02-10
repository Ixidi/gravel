
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerVehicleMovePacket


class ServerVehicleMovePacketImpl : StandardPacket(), ServerVehicleMovePacket {
            
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var yaw: Float by float()
	override var pitch: Float by float()
            
}
    