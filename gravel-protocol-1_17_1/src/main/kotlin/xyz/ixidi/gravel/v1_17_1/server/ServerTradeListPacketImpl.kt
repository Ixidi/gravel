
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerTradeListPacket


class ServerTradeListPacketImpl : StandardPacket(), ServerTradeListPacket {
            
	override var windowId: Int by varInt()
	// override var trades: List<Trade>
	override var villagerLevel: Int by varInt()
	override var experience: Int by varInt()
	override var isRegularVillager: Boolean by boolean()
	override var canRestock: Boolean by boolean()
            
}
    