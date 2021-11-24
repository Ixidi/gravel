package xyz.ixidi.gravel.packet.status

import xyz.ixidi.gravel.packet.StandardPacket

class PingPacket : StandardPacket() {

    var payload by long()

}