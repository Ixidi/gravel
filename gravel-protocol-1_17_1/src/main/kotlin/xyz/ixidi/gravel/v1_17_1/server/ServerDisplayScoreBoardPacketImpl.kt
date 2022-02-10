
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerDisplayScoreBoardPacket
import xyz.ixidi.gravel.api.io.Position

class ServerDisplayScoreBoardPacketImpl : StandardPacket(), ServerDisplayScoreBoardPacket {
            
	override var position: Position by position()
	override var scoreName: String by string()
            
}
    