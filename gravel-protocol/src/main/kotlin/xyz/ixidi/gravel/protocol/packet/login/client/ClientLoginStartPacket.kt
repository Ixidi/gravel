package xyz.ixidi.gravel.protocol.packet.login.client

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ClientLoginStartPacket : StandardPacket() {

    var name by string(16)

}