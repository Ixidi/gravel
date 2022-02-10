
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPluginMessagePacket


class ClientPluginMessagePacketImpl : StandardPacket(), ClientPluginMessagePacket {
            
	override var channel: String by string()
	// override var data: ByteArray
            
}
    