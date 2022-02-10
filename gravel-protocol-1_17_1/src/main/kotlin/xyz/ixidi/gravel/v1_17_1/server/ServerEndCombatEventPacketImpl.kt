
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEndCombatEventPacket


class ServerEndCombatEventPacketImpl : StandardPacket(), ServerEndCombatEventPacket {
            
	override var duration: Int by varInt()
	override var entityId: Int by varInt()
            
}
    