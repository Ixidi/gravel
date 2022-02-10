
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSpectatePacket


class ClientSpectatePacketImpl : StandardPacket(), ClientSpectatePacket {
            
	override var targetPlayer: UUID by uuid()
            
}
    