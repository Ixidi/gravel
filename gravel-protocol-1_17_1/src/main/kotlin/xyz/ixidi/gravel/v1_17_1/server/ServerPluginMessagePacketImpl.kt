
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPluginMessagePacket
import xyz.ixidi.gravel.api.io.Identifier

class ServerPluginMessagePacketImpl : StandardPacket(), ServerPluginMessagePacket {
            
	override var channel: Identifier by identifier()
	// override var data: ByteArray
            
}
    