
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerAdvancementsPacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerAdvancementsPacketImpl : StandardPacket(), ServerAdvancementsPacket {
            
	override var reset: Boolean by boolean()
	// override var advancementsMapping: Map<Identifier, Advancement>
	override var identifiers: List<Identifier> by identifierList()
	// override var progressMapping: Map<Identifier, AdvancementProgress>
            
}
    