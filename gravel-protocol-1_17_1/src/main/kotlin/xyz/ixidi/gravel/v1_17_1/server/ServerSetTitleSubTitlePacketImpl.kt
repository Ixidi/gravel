
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetTitleSubTitlePacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerSetTitleSubTitlePacketImpl : StandardPacket(), ServerSetTitleSubTitlePacket {
            
	override var subtitleText: TextComponent by textComponent()
            
}
    