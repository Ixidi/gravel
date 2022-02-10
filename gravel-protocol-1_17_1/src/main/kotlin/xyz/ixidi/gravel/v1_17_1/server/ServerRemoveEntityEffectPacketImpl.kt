
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerRemoveEntityEffectPacket


class ServerRemoveEntityEffectPacketImpl : StandardPacket(), ServerRemoveEntityEffectPacket {
            
	override var entityId: Int by varInt()
	override var effectId: Byte by byte()
            
}
    