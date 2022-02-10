
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerDeclareCommandsPacket


class ServerDeclareCommandsPacketImpl : StandardPacket(), ServerDeclareCommandsPacket {
            
	// override var nodes: List<Node>
	override var rootIndex: Int by varInt()
            
}
    