
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientVehicleMovePacket


class ClientVehicleMovePacketImpl : StandardPacket(), ClientVehicleMovePacket {
            
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var yaw: Float by float()
	override var pitch: Float by float()
            
}
    