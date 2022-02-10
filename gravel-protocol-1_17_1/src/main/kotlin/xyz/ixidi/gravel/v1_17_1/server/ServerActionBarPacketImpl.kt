
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerActionBarPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerActionBarPacketImpl : StandardPacket(), ServerActionBarPacket {
            
	override var text: TextComponent by textComponent()
            
}
    