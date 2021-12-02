package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.SlotData
import xyz.ixidi.gravel.api.packet.Packet

interface ServerWindowItemsPacket : Packet {

    var windowId: UByte
    var stateId: Int
    var slots: List<SlotData>
    var carriedItem: SlotData

}