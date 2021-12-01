package xyz.ixidi.gravel.api.io

import xyz.ixidi.gravel.api.nbt.CompoundTag

data class Slot(
    val itemId: Int,
    val itemCount: Byte,
    val nbt: CompoundTag
)