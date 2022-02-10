
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerDeathCombatEventPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerDeathCombatEventPacketImpl : StandardPacket(), ServerDeathCombatEventPacket {
            
	override var playerId: Int by varInt()
	override var entityId: Int by varInt()
	override var message: TextComponent by textComponent()
            
}
    