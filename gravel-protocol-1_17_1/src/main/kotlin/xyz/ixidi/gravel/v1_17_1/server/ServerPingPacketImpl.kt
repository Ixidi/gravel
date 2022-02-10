
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPingPacket


class ServerPingPacketImpl : StandardPacket(), ServerPingPacket {
            
	override var id: Int by varInt()
            
}
    