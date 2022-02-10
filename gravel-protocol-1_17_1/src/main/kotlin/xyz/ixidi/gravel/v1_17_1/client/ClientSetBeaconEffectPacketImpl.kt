
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSetBeaconEffectPacket


class ClientSetBeaconEffectPacketImpl : StandardPacket(), ClientSetBeaconEffectPacket {
            
	override var primaryEffect: Int by varInt()
	override var secondaryEffect: Int by varInt()
            
}
    