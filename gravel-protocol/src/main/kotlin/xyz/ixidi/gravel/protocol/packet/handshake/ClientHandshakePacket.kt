package xyz.ixidi.gravel.protocol.packet.handshake

import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.VarIntEnum

class ClientHandshakePacket : StandardPacket() {

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