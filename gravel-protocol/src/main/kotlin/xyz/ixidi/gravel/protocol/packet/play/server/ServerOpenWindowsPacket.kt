package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet

interface ServerOpenWindowsPacket : Packet {

    var windowsId: Int
    var windowType: Int
    var windowTitle: TextComponent

}