
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerTabCompletePacket


class ServerTabCompletePacketImpl : StandardPacket(), ServerTabCompletePacket {
            
	override var id: Int by varInt()
	override var start: Int by varInt()
	override var length: Int by varInt()
	// override var matches: List<Match>
            
}
    