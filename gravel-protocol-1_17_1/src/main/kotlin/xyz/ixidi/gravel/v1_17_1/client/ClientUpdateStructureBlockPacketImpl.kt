
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUpdateStructureBlockPacket
import xyz.ixidi.gravel.api.io.Position

class ClientUpdateStructureBlockPacketImpl : StandardPacket(), ClientUpdateStructureBlockPacket {
            
	override var location: Position by position()
	// override var action: Action
	// override var mode: Mode
	override var name: String by string()
	override var offsetX: Byte by byte()
	override var offsetY: Byte by byte()
	override var offsetZ: Byte by byte()
	override var sizeX: Byte by byte()
	override var sizeY: Byte by byte()
	override var sizeZ: Byte by byte()
	// override var mirror: Mirror
	// override var rotation: Rotation
	override var metadata: String by string()
	override var integrity: Float by float()
	override var seed: Long by long()
	override var ignoreEntities: Boolean by boolean()
	override var showAir: Boolean by boolean()
	override var showBoundingBox: Boolean by boolean()
            
}
    