
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityEquipmentPacket


class ServerEntityEquipmentPacketImpl : StandardPacket(), ServerEntityEquipmentPacket {
            
	override var entityId: Int by varInt()
	// override var equipment: Map<SlotType, SlotData>
            
}
    