
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSteerBoatPacket


class ClientSteerBoatPacketImpl : StandardPacket(), ClientSteerBoatPacket {
            
	override var leftPaddleTurning: Boolean by boolean()
	override var rightPaddleTurning: Boolean by boolean()
            
}
    