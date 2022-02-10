
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSteerVehiclePacket


class ClientSteerVehiclePacketImpl : StandardPacket(), ClientSteerVehiclePacket {
            
	override var sideways: Float by float()
	override var forward: Float by float()
	override var jump: Boolean by boolean()
	override var unmount: Boolean by boolean()
            
}
    