
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerBossBarPacket


class ServerBossBarPacketImpl : StandardPacket(), ServerBossBarPacket {
            
	override var uuid: UUID by uuid()
	// override var action: Action
            
}
    