
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSetRecipeBookStatePacket


class ClientSetRecipeBookStatePacketImpl : StandardPacket(), ClientSetRecipeBookStatePacket {
            
	// override var book: Book
	override var bookOpen: Boolean by boolean()
	override var filterActive: Boolean by boolean()
            
}
    