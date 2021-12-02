package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.protocol.misc.WindowType

interface ServerOpenWindowsPacket : Packet {

    var windowsId: Int
    var windowType: WindowType
    var windowTitle: TextComponent

}