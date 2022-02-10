
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerMapDataPacket


class ServerMapDataPacketImpl : StandardPacket(), ServerMapDataPacket {
            
	override var mapId: Int by varInt()
	override var scale: Byte by byte()
	override var locked: Boolean by boolean()
	override var trackingPosition: Boolean by boolean()
	// override var icons: List<Icon>
	override var columns: UByte by uByte()
	// override var rows: Byte?
	// override var x: Byte?
	// override var z: Byte?
	// override var data: List<UByte>?
            
}
    