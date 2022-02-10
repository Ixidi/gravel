
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerOpenHorseWindowPacket


class ServerOpenHorseWindowPacketImpl : StandardPacket(), ServerOpenHorseWindowPacket {
            
	override var windowId: Byte by byte()
	override var numberOfSlots: Int by varInt()
	override var entityId: Int by varInt()
            
}
    