
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEffectPacket
import xyz.ixidi.gravel.api.io.Position

class ServerEffectPacketImpl : StandardPacket(), ServerEffectPacket {
            
	override var effectId: Int by varInt()
	override var location: Position by position()
	override var data: Int by varInt()
	override var disableRelativeVolume: Boolean by boolean()
            
}
    