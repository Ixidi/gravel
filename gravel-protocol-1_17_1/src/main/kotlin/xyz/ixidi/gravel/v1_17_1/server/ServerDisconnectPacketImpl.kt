
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerDisconnectPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerDisconnectPacketImpl : StandardPacket(), ServerDisconnectPacket {
            
	override var reason: TextComponent by textComponent()
            
}
    