
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerTimeUpdatePacket


class ServerTimeUpdatePacketImpl : StandardPacket(), ServerTimeUpdatePacket {
            
	override var worldAge: Long by long()
	override var timeOfDay: Long by long()
            
}
    