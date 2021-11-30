package xyz.ixidi.gravel.protocol.packet.status.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ServerPongPacket : StandardPacket() {

    var payload by long()

}