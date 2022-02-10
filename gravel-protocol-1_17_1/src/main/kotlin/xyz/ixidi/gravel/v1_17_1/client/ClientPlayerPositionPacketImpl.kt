
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerPositionPacket


class ClientPlayerPositionPacketImpl : StandardPacket(), ClientPlayerPositionPacket {
            
	override var x: Double by double()
	override var feetY: Double by double()
	override var z: Double by double()
	override var onGround: Boolean by boolean()
            
}
    