
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUpdateScorePacket


class ServerUpdateScorePacketImpl : StandardPacket(), ServerUpdateScorePacket {
            
	override var entityName: String by string()
	// override var action: Action
	override var objectiveName: String by string()
	// override var value: Int?
            
}
    