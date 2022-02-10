
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerChangeGameStatePacket


class ServerChangeGameStatePacketImpl : StandardPacket(), ServerChangeGameStatePacket {
            
	override var reason: UByte by uByte()
	override var value: Float by float()
            
}
    