
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnPositionPacket
import xyz.ixidi.gravel.api.io.Position

class ServerSpawnPositionPacketImpl : StandardPacket(), ServerSpawnPositionPacket {
            
	override var location: Position by position()
	override var angle: Float by float()
            
}
    