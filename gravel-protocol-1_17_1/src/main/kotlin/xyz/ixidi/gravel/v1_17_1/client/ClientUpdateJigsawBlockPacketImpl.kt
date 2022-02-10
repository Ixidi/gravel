
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientUpdateJigsawBlockPacket
import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.io.Position

class ClientUpdateJigsawBlockPacketImpl : StandardPacket(), ClientUpdateJigsawBlockPacket {
            
	override var location: Position by position()
	override var name: Identifier by identifier()
	override var target: Identifier by identifier()
	override var pool: Identifier by identifier()
	// override var finalState: FinalState
	// override var jointType: JointType
            
}
    