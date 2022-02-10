
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUpdateCommandBlockMinecartPacket


class ClientUpdateCommandBlockMinecartPacketImpl : StandardPacket(), ClientUpdateCommandBlockMinecartPacket {
            
	override var entityId: Int by varInt()
	override var command: String by string()
	override var trackOutput: Boolean by boolean()
            
}
    