
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUpdateCommandBlockPacket
import xyz.ixidi.gravel.api.io.Position

class ClientUpdateCommandBlockPacketImpl : StandardPacket(), ClientUpdateCommandBlockPacket {
            
	override var location: Position by position()
	override var command: String by string()
	// override var mode: Mode
	override var trackOutput: Boolean by boolean()
	override var isConditional: Boolean by boolean()
	override var automatic: Boolean by boolean()
            
}
    