package xyz.ixidi.gravel.api.misc

import xyz.ixidi.gravel.api.nbt.CompoundTag

sealed interface SlotData {

    object Empty : SlotData

    data class Item(
        val itemId: Int,
        val itemCount: Byte,
        val nbt: CompoundTag
    ) : SlotData

}