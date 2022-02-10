
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSetDisplayedRecipePacket
import xyz.ixidi.gravel.api.io.Identifier

class ClientSetDisplayedRecipePacketImpl : StandardPacket(), ClientSetDisplayedRecipePacket {
            
	override var recipeId: Identifier by identifier()
            
}
    