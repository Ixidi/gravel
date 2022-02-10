package xyz.ixidi.gravel.protocol.packet.login.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.protocol.packet.StandardPacket

class ServerLoginDisconnectPacket : StandardPacket() {

    var reason: TextComponent by textComponent()

}