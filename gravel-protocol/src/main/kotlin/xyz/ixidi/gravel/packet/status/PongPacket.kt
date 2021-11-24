package xyz.ixidi.gravel.packet.status

import xyz.ixidi.gravel.packet.StandardPacket

class PongPacket : StandardPacket() {

    var payload by long()

}