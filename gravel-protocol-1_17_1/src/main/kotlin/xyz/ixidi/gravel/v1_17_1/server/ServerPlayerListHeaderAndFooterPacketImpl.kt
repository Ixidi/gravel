
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerListHeaderAndFooterPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerPlayerListHeaderAndFooterPacketImpl : StandardPacket(), ServerPlayerListHeaderAndFooterPacket {
            
	override var header: TextComponent by textComponent()
	override var footer: TextComponent by textComponent()
            
}
    