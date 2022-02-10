
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerWindowPropertyPacket


class ServerWindowPropertyPacketImpl : StandardPacket(), ServerWindowPropertyPacket {
            
	override var windowId: UByte by uByte()
	override var property: Short by short()
	override var value: Short by short()
            
}
    