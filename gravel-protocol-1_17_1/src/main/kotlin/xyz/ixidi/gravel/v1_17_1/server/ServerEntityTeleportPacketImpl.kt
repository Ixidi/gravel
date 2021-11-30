package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityTeleportPacket

class ServerEntityTeleportPacketImpl : StandardPacket(), ServerEntityTeleportPacket {

    override var entityId: Int by varInt()
    override var x: Double by double()
    override var y: Double by double()
    override var z: Double by double()
    override var pitch: Float by byte().mapped(
        convertFrom = { (it * 360).toInt().toByte()  },
        convertTo = { it.toInt() / 360f }
    )
    override var yaw: Float by byte().mapped(
        convertFrom = { (it * 360).toInt().toByte()  },
        convertTo = { it.toInt() / 360f }
    )
    override var onGround: Boolean by boolean()

}