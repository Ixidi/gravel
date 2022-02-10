
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerTeamsPacket


class ServerTeamsPacketImpl : StandardPacket(), ServerTeamsPacket {
            
	override var teamName: String by string()
	// override var operaion: Operation
            
}
    