
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerBlockBreakAnimationPacket
import xyz.ixidi.gravel.api.io.Position

class ServerBlockBreakAnimationPacketImpl : StandardPacket(), ServerBlockBreakAnimationPacket {
            
	override var entityId: Int by varInt()
	override var location: Position by position()
	override var destroyStage: Byte by byte()
            
}
    