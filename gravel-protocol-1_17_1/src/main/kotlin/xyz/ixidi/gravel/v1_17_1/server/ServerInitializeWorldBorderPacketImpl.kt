
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerInitializeWorldBorderPacket


class ServerInitializeWorldBorderPacketImpl : StandardPacket(), ServerInitializeWorldBorderPacket {
            
	override var x: Double by double()
	override var y: Double by double()
	override var z: Double by double()
	override var oldDiameter: Double by double()
	override var newDiameter: Double by double()
	override var speed: Long by long()
	override var portalTeleportBoundary: Int by varInt()
	override var warningBlocks: Int by varInt()
	override var warningTime: Int by varInt()
            
}
    