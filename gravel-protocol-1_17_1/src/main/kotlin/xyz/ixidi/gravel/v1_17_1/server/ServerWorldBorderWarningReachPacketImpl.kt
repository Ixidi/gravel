
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWorldBorderWarningReachPacket


class ServerWorldBorderWarningReachPacketImpl : StandardPacket(), ServerWorldBorderWarningReachPacket {
            
	override var warningBlocks: Int by varInt()
            
}
    