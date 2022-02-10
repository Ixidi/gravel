
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientTeleportConfirmPacket


class ClientTeleportConfirmPacketImpl : StandardPacket(), ClientTeleportConfirmPacket {
            
	override var teleportId: Int by varInt()
            
}
    