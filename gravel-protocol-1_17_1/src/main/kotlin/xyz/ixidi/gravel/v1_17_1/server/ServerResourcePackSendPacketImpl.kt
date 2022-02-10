
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerResourcePackSendPacket


class ServerResourcePackSendPacketImpl : StandardPacket(), ServerResourcePackSendPacket {
            
	override var url: String by string()
	override var hash: String by string()
	override var forced: Boolean by boolean()
	// override var promptMessage: TextComponent?
            
}
    