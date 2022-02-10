
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWorldBorderCenterPacket


class ServerWorldBorderCenterPacketImpl : StandardPacket(), ServerWorldBorderCenterPacket {
            
	override var x: Double by double()
	override var z: Double by double()
            
}
    