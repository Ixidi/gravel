package xyz.ixidi.gravel.protocol.packet.status.client

import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ClientPingPacket : StandardPacket() {

    var payload by long()

}