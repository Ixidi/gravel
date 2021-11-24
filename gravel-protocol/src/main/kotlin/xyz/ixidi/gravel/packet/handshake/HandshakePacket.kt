package xyz.ixidi.gravel.packet.handshake

import xyz.ixidi.gravel.packet.StandardPacket
import xyz.ixidi.gravel.packet.VarIntEnum

class HandshakePacket : StandardPacket() {

    enum class NextState(
        override val varIntValue: Int
    ) : VarIntEnum {

        STATUS(1),
        LOGIN(2);

    }

    var protocolVersion by varInt()
    var serverAddress by string(255)
    var serverPort by uShort()
    var nextState by varIntEnum(*NextState.values())

}