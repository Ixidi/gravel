
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerBlockPlacementPacket
import xyz.ixidi.gravel.api.io.Position

class ClientPlayerBlockPlacementPacketImpl : StandardPacket(), ClientPlayerBlockPlacementPacket {
            
	override var offHand: Boolean by boolean()
	override var blockLocation: Position by position()
	// override var blockFace: BlockFace
	override var cursorPositionX: Float by float()
	override var cursorPositionY: Float by float()
	override var cursorPositionZ: Float by float()
	override var insideBlock: Boolean by boolean()
            
}
    