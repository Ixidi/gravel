
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerDiggingPacket
import xyz.ixidi.gravel.api.io.Position

class ClientPlayerDiggingPacketImpl : StandardPacket(), ClientPlayerDiggingPacket {
            
	// override var status: Status
	override var location: Position by position()
	// override var face: BlockFace
            
}
    