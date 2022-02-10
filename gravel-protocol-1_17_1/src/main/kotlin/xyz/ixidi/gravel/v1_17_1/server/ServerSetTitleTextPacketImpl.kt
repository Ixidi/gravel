
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetTitleTextPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerSetTitleTextPacketImpl : StandardPacket(), ServerSetTitleTextPacket {
            
	override var titleText: TextComponent by textComponent()
            
}
    