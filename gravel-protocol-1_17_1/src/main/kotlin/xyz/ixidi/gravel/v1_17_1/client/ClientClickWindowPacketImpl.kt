
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientClickWindowPacket
import xyz.ixidi.gravel.api.io.SlotData

class ClientClickWindowPacketImpl : StandardPacket(), ClientClickWindowPacket {
            
	override var windowId: UByte by uByte()
	override var slot: Short by short()
	override var stateId: Int by varInt()
	override var button: Byte by byte()
	override var mode: Int by varInt()
	// override var newSlotsData: Map<Short, SlotData>
	override var clickedItem: SlotData by slot()
            
}
    