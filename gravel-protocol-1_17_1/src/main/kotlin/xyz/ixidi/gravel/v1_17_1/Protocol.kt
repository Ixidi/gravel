package xyz.ixidi.gravel.v1_17_1

import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.protocol.packet.handshake.ClientHandshakePacket
import xyz.ixidi.gravel.protocol.packet.login.client.ClientLoginStartPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerLoginSuccessPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerSetCompressionPacket
import xyz.ixidi.gravel.protocol.packet.status.client.ClientPingPacket
import xyz.ixidi.gravel.protocol.packet.status.client.ClientRequestPacket
import xyz.ixidi.gravel.protocol.packet.status.server.ServerPongPacket
import xyz.ixidi.gravel.protocol.packet.status.server.ServerResponsePacket
import xyz.ixidi.gravel.protocol.Protocol
import xyz.ixidi.gravel.protocol.Protocols
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityTeleportPacket
import xyz.ixidi.gravel.v1_17_1.client.ClientAnimationPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientChatMessagePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerEntityPositionPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientHeldItemChangePacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientInteractEntityPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientKeepAlivePacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientPlayerBlockPlacementPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientPlayerPositionAndRotationPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientPlayerPositionPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientPluginMessagePacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientSettingsPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientTeleportConfirmPacketImpl
import xyz.ixidi.gravel.v1_17_1.client.ClientUseItemPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerHeldItemChangePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerChatMessagePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerEntityStatusPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerEntityTeleportPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerJoinGamePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerKeepAlivePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerOpenWindowsPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerPlayerPositionAndLookPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerPluginMessagePacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerSetSlotPacketImpl
import xyz.ixidi.gravel.v1_17_1.server.ServerSpawnEntityPacketImpl

private val protocol = Protocol(756) {
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

        play {
            packet(0x0f) { ClientKeepAlivePacketImpl() }
            packet(0x03) { ClientChatMessagePacketImpl() }
            packet(0x25) { ClientHeldItemChangePacketImpl() }
            packet(0x05) { ClientSettingsPacketImpl() }
            packet(0x0a) { ClientPluginMessagePacketImpl() }
            packet(0x00) { ClientTeleportConfirmPacketImpl() }
            packet(0x11) { ClientPlayerPositionPacketImpl() }
            packet(0x12) { ClientPlayerPositionAndRotationPacketImpl() }
            packet(0x0d) { ClientInteractEntityPacketImpl() }
            packet(0x2f) { ClientUseItemPacketImpl() }
            packet(0x2c) { ClientAnimationPacketImpl() }
            packet(0x2e) { ClientPlayerBlockPlacementPacketImpl() }
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

        play {
            packet(0x21) { ServerKeepAlivePacketImpl() }
            packet(0x0f) { ServerChatMessagePacketImpl() }
            packet(0x48) { ServerHeldItemChangePacketImpl() }
            packet(0x1b) { ServerEntityStatusPacketImpl() }
            packet(0x26) { ServerJoinGamePacketImpl() }
            packet(0x18) { ServerPluginMessagePacketImpl() }
            packet(0x38) { ServerPlayerPositionAndLookPacketImpl() }
            packet(0x00) { ServerSpawnEntityPacketImpl() }
            packet(0x29) { ServerEntityPositionPacketImpl() }
            packet(0x61) { ServerEntityTeleportPacketImpl() }
            packet(0x2e) { ServerOpenWindowsPacketImpl() }
            packet(0x16) { ServerSetSlotPacketImpl() }
        }
    }
}

val Protocols.v1_17_1: Protocol
    get() = protocol