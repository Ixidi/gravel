package xyz.ixidi.gravel.core.status

import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.packet.handshake.HandshakePacket
import xyz.ixidi.gravel.packet.status.PingPacket
import xyz.ixidi.gravel.packet.status.PongPacket
import xyz.ixidi.gravel.packet.status.RequestPacket
import xyz.ixidi.gravel.packet.status.ResponsePacket
import xyz.ixidi.gravel.protocol.Protocol
import xyz.ixidi.gravel.protocol.Protocols

private val statusProtocol = Protocol(-1) {
    client {
        handshake {
            packet(0x00) { HandshakePacket() }
        }

        status {
            packet(0x00) { RequestPacket() }
            packet(0x01) { PingPacket() }
        }
    }

    server {
        status {
            packet(0x00) { ResponsePacket() }
            packet(0x01) { PongPacket() }
        }
    }
}

val Protocols.status: Protocol
    get() = statusProtocol