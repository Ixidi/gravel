
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWorldBorderLerpSizePacket


class ServerWorldBorderLerpSizePacketImpl : StandardPacket(), ServerWorldBorderLerpSizePacket {
            
	override var oldDiameter: Double by double()
	override var newDiameter: Double by double()
	override var speed: Long by long()
            
}
    