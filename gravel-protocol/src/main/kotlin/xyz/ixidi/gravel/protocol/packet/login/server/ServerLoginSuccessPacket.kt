package xyz.ixidi.gravel.protocol.packet.login.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ServerLoginSuccessPacket : StandardPacket() {

    var uuid by uuid()
    var username by string(16)

}