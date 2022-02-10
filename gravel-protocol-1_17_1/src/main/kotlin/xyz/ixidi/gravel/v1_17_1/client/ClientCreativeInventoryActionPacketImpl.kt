
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientCreativeInventoryActionPacket
import xyz.ixidi.gravel.api.io.SlotData

class ClientCreativeInventoryActionPacketImpl : StandardPacket(), ClientCreativeInventoryActionPacket {
            
	override var slot: Short by short()
	override var clickedItem: SlotData by slot()
            
}
    