
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerOpenSignEditorPacket
import xyz.ixidi.gravel.api.io.Position

class ServerOpenSignEditorPacketImpl : StandardPacket(), ServerOpenSignEditorPacket {
            
	override var location: Position by position()
            
}
    