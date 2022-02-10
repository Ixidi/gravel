
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityVelocityPacket


class ServerEntityVelocityPacketImpl : StandardPacket(), ServerEntityVelocityPacket {
            
	override var entityId: Int by varInt()
	override var velocityX: Short by short()
	override var velocityY: Short by short()
	override var velocityZ: Short by short()
            
}
    