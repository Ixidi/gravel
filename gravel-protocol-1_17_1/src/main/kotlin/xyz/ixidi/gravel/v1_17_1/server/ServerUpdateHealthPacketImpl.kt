
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUpdateHealthPacket


class ServerUpdateHealthPacketImpl : StandardPacket(), ServerUpdateHealthPacket {
            
	override var health: Float by float()
	override var food: Int by varInt()
	override var foodSaturation: Float by float()
            
}
    