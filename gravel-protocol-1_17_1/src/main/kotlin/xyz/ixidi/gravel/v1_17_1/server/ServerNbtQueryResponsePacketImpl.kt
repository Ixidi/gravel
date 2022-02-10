
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerNbtQueryResponsePacket


class ServerNbtQueryResponsePacketImpl : StandardPacket(), ServerNbtQueryResponsePacket {
            
	override var transactionId: Int by varInt()
	// override var nbt: CompoundTag
            
}
    