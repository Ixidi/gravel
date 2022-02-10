
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetExperiencePacket


class ServerSetExperiencePacketImpl : StandardPacket(), ServerSetExperiencePacket {
            
	override var experienceBar: Float by float()
	override var level: Int by varInt()
	override var totalExperience: Int by varInt()
            
}
    