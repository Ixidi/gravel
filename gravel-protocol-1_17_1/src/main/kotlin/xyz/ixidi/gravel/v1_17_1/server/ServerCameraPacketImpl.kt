
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerCameraPacket


class ServerCameraPacketImpl : StandardPacket(), ServerCameraPacket {
            
	override var cameraId: Int by varInt()
            
}
    