package xyz.ixidi.gravel.packet.login

import xyz.ixidi.gravel.packet.StandardPacket

class SetCompressionPacket : StandardPacket() {
    var threshold by varInt()
}