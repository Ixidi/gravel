
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetTitleTimePacket


class ServerSetTitleTimePacketImpl : StandardPacket(), ServerSetTitleTimePacket {
            
	override var fadeIn: Int by varInt()
	override var stay: Int by varInt()
	override var fadeOut: Int by varInt()
            
}
    