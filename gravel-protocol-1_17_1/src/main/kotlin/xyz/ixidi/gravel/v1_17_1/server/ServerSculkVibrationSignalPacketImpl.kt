
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSculkVibrationSignalPacket


class ServerSculkVibrationSignalPacketImpl : StandardPacket(), ServerSculkVibrationSignalPacket {
            
	override var arrivalTicks: Int by varInt()
            
}
    