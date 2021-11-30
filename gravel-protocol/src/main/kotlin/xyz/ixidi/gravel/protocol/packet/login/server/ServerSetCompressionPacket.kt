package xyz.ixidi.gravel.protocol.packet.login.server

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ServerSetCompressionPacket : StandardPacket() {
    var threshold by varInt()
}