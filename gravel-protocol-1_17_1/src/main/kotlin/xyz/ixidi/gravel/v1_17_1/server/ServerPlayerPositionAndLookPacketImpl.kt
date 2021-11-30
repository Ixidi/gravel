package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerPositionAndLookPacket

class ServerPlayerPositionAndLookPacketImpl : StandardPacket(), ServerPlayerPositionAndLookPacket {

    override var x: Double by double()
    override var y: Double by double()
    override var z: Double by double()
    override var yaw: Float by float()
    override var pitch: Float by float()
    override var flags: Byte by byte()
    override var teleportId: Int by varInt()
    override var dismountVehicle: Boolean by boolean()

}