
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWindowItemsPacket
import xyz.ixidi.gravel.api.io.SlotData

class ServerWindowItemsPacketImpl : StandardPacket(), ServerWindowItemsPacket {
            
	override var windowId: UByte by uByte()
	override var stateId: Int by varInt()
	override var slots: List<SlotData> by slotList()
	override var carriedItem: SlotData by slot()
            
}
    