
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetSlotPacket
import xyz.ixidi.gravel.api.io.SlotData

class ServerSetSlotPacketImpl : StandardPacket(), ServerSetSlotPacket {
            
	override var windowId: Byte by byte()
	override var stateId: Int by varInt()
	override var slot: Short by short()
	override var slotData: SlotData by slot()
            
}
    