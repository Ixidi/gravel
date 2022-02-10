
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerBlockActionPacket
import xyz.ixidi.gravel.api.io.Position

class ServerBlockActionPacketImpl : StandardPacket(), ServerBlockActionPacket {
            
	override var location: Position by position()
	override var actionId: UByte by uByte()
	override var actionParam: UByte by uByte()
	override var blockType: Int by varInt()
            
}
    