
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWorldBorderSizePacket


class ServerWorldBorderSizePacketImpl : StandardPacket(), ServerWorldBorderSizePacket {
            
	override var diameter: Double by double()
            
}
    