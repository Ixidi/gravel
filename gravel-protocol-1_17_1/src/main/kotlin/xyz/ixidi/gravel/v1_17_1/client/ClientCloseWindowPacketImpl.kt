
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientCloseWindowPacket


class ClientCloseWindowPacketImpl : StandardPacket(), ClientCloseWindowPacket {
            
	override var windowId: UByte by uByte()
            
}
    