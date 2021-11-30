package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.protocol.packet.handshake.ClientHandshakePacket
import xyz.ixidi.gravel.protocol.packet.login.client.ClientLoginStartPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerLoginSuccessPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerSetCompressionPacket
import xyz.ixidi.gravel.protocol.packet.status.client.ClientPingPacket
import xyz.ixidi.gravel.protocol.packet.status.server.ServerPongPacket
import xyz.ixidi.gravel.protocol.packet.status.client.ClientRequestPacket
import xyz.ixidi.gravel.protocol.packet.status.server.ServerResponsePacket

private val basicProtocol = Protocol(-1) {
    client {
        handshake {
            packet(0x00) { ClientHandshakePacket() }
        }

        status {
            packet(0x00) { ClientRequestPacket() }
            packet(0x01) { ClientPingPacket() }
        }

        login {
            packet(0x00) { ClientLoginStartPacket() }
        }
    }

    server {
        status {
            packet(0x00) { ServerResponsePacket() }
            packet(0x01) { ServerPongPacket() }
        }

        login {
            packet(0x02) { ServerLoginSuccessPacket() }
            packet(0x03) { ServerSetCompressionPacket() }
        }
    }
}

val Protocols.basic: Protocol
    get() = basicProtocol