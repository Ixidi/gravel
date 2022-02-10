
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUnlockRecipesPacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerUnlockRecipesPacketImpl : StandardPacket(), ServerUnlockRecipesPacket {
            
	// override var action: Action
	override var craftingRecipeBookOpen: Boolean by boolean()
	override var craftingRecipeBookFilterActive: Boolean by boolean()
	override var smeltingRecipeBookOpen: Boolean by boolean()
	override var smeltingRecipeBookFilterActive: Boolean by boolean()
	override var blastFurnaceRecipeBookOpen: Boolean by boolean()
	override var blastFurnaceRecipeBookFilterActive: Boolean by boolean()
	override var smokerRecipeBookOpen: Boolean by boolean()
	override var smokerRecipeBookFilterActive: Boolean by boolean()
	override var firstRecipeIds: List<Identifier> by identifierList()
	// override var secondRecipeIds: List<Identifier>?
            
}
    