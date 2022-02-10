
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerScoreBoardObjectivePacket


class ServerScoreBoardObjectivePacketImpl : StandardPacket(), ServerScoreBoardObjectivePacket {
            
	override var objectiveName: String by string()
	// override var mode: Mode
	// override var objectiveValue: TextComponent?
	// override var type: Type
            
}
    