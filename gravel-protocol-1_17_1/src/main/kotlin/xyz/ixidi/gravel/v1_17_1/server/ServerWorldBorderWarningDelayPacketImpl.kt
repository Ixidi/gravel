
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWorldBorderWarningDelayPacket


class ServerWorldBorderWarningDelayPacketImpl : StandardPacket(), ServerWorldBorderWarningDelayPacket {
            
	override var warningTime: Int by varInt()
            
}
    