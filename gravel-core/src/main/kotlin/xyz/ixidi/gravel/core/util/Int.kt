package xyz.ixidi.gravel.core.util

import kotlin.math.ceil

val Int.byteSizeAsVarInt: Int
    get() = ceil((Int.SIZE_BITS - countLeadingZeroBits()) / 7.0).toInt()