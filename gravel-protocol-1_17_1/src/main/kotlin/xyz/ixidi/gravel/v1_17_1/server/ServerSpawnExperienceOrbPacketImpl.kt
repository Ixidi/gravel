
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnExperienceOrbPacket


class ServerSpawnExperienceOrbPacketImpl : StandardPacket(), ServerSpawnExperienceOrbPacket {
            
	override var entityId: Int by varInt()
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var cound: Short by short()
            
}
    