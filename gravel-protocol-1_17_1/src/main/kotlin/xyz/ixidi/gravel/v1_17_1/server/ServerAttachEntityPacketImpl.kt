
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerAttachEntityPacket


class ServerAttachEntityPacketImpl : StandardPacket(), ServerAttachEntityPacket {
            
	override var attachedEntityId: Int by varInt()
	override var holdingEntityId: Int by varInt()
            
}
    