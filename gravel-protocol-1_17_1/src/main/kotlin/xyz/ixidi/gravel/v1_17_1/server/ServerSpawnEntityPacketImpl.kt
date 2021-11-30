package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnEntityPacket
import java.util.UUID

class ServerSpawnEntityPacketImpl : StandardPacket(), ServerSpawnEntityPacket {

    override var entityId: Int by varInt()
    override var objectUUID: UUID by uuid()
    override var type: Int by varInt()
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
    override var data: Int by int()
    override var velocityX: Short by short()
    override var velocityY: Short by short()
    override var velocityZ: Short by short()

}