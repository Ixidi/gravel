
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSelectTradePacket


class ClientSelectTradePacketImpl : StandardPacket(), ClientSelectTradePacket {
            
	override var selectedSlot: Int by varInt()
            
}
    