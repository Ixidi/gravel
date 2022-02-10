
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetPassengersPacket


class ServerSetPassengersPacketImpl : StandardPacket(), ServerSetPassengersPacket {
            
	override var entityId: Int by varInt()
	override var passengerIds: List<Int> by varIntList()
            
}
    