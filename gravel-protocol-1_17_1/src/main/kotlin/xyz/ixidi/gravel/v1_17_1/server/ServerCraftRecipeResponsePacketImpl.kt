
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerCraftRecipeResponsePacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerCraftRecipeResponsePacketImpl : StandardPacket(), ServerCraftRecipeResponsePacket {
            
	override var windowId: Byte by byte()
	override var recipe: Identifier by identifier()
            
}
    