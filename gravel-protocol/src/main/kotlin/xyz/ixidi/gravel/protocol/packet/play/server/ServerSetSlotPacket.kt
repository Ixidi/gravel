package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.SlotData
import xyz.ixidi.gravel.api.packet.Packet

interface ServerSetSlotPacket : Packet {

    var windowId: Byte
    var stateId: Int
    var slot: Short
    var slotData: SlotData

}