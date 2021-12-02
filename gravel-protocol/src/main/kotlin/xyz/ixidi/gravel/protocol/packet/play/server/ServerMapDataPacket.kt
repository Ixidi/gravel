package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet

interface ServerMapDataPacket : Packet {

    data class Icon(
        val type: Type,
        val x: Byte,
        val y: Byte,
        var z: Byte,
        var direction: Byte,
        var displayName: TextComponent?
    ) {

        enum class Type {
            WHITE_ARROW,
            GREEN_ARROW,
            RED_ARROW,
            BLUE_ARROW,
            WHITE_CROSS,
            RED_POINTER,
            WHITE_CIRCLE,
            SMALL_WHITE_CIRCLE,
            MANSION,
            TEMPLE,
            WHITE_BANNER,
            ORANGE_BANNER,
            MAGENTA_BANNER,
            LIGHT_BLUE_BANNER,
            YELLOW_BANNER,
            LIME_BANNER,
            PINK_BANNER,
            GRAY_BANNER,
            LIGHT_GRAY_BANNER,
            CYAN_BANNER,
            PURPLE_BANNER,
            BLUE_BANNER,
            BROWN_BANNER,
            GREEN_BANNER,
            RED_BANNER,
            BLACK_BANNER,
            TREASURE_MARKER
        }

    }

    var mapId: Int
    var scale: Byte
    var locked: Boolean
    var trackingPosition: Boolean
    var icons: List<Icon>
    var columns: UByte
    var rows: Byte?
    var x: Byte?
    var z: Byte?
    var data: List<UByte>?

}