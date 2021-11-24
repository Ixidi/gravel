package xyz.ixidi.gravel.packet.status

import xyz.ixidi.gravel.packet.StandardPacket

class ResponsePacket : StandardPacket() {

    var jsonResponse by string()

}