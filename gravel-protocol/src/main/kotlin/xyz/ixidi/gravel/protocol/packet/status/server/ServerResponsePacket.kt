package xyz.ixidi.gravel.protocol.packet.status.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ServerResponsePacket : StandardPacket() {

    var jsonResponse by string()

}