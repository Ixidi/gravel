
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientGenerateStructurePacket
import xyz.ixidi.gravel.api.io.Position

class ClientGenerateStructurePacketImpl : StandardPacket(), ClientGenerateStructurePacket {
            
	override var location: Position by position()
	override var levels: Int by varInt()
	override var keepJigsaws: Boolean by boolean()
            
}
    