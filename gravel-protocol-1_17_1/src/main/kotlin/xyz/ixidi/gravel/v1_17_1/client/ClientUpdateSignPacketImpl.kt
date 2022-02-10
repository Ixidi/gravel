
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUpdateSignPacket
import xyz.ixidi.gravel.api.io.Position

class ClientUpdateSignPacketImpl : StandardPacket(), ClientUpdateSignPacket {
            
	override var location: Position by position()
	override var lineOne: String by string()
	override var lineTwo: String by string()
	override var lineThree: String by string()
	override var lineFour: String by string()
            
}
    