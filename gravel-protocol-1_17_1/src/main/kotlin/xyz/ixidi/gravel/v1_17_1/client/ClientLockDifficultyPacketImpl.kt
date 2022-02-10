
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientLockDifficultyPacket


class ClientLockDifficultyPacketImpl : StandardPacket(), ClientLockDifficultyPacket {
            
	override var locked: Boolean by boolean()
            
}
    