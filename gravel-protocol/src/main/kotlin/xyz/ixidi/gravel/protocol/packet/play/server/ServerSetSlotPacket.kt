package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.api.packet.Packet

interface ServerSetSlotPacket : Packet {

    data class SlotData(
        var itemId: Int,
        var itemCount: Int,
        var nbt: CompoundTag
    )

    var windowId: Byte
    var stateId: Int
    var slot: Short
    var slotData: SlotData?

}