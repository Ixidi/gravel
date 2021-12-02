package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.packet.Packet

interface ServerCraftRecipeResponsePacket : Packet {

    var windowId: Byte
    var recipe: Identifier

}