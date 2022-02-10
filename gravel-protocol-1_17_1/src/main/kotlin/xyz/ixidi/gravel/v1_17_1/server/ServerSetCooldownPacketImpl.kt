
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetCooldownPacket


class ServerSetCooldownPacketImpl : StandardPacket(), ServerSetCooldownPacket {
            
	override var itemId: Int by varInt()
	override var cooldownTicks: Int by varInt()
            
}
    