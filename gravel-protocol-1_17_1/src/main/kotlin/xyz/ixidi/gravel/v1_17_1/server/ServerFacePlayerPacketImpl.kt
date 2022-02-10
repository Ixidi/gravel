
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerFacePlayerPacket


class ServerFacePlayerPacketImpl : StandardPacket(), ServerFacePlayerPacket {
            
	// override var lookType: LookType
	override var targetX: Double by double()
	override var targetY: Double by double()
	override var targetZ: Double by double()
	override var isEntity: Boolean by boolean()
	// override var entityId: Int?
	// override var entityLookType: LookType?
            
}
    