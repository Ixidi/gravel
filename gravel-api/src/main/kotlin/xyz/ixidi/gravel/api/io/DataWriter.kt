package xyz.ixidi.gravel.api.io

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.nbt.CompoundTag

/**
 * Writes specified data types described [here](https://wiki.vg/Data_types)
 */
interface DataWriter {

    suspend fun writeVarInt(value: Int)
    suspend fun writeUShort(value: UShort)
    suspend fun writeShort(value: Short)
    suspend fun writeFully(value: ByteArray)
    suspend fun writeLong(value: Long)
    suspend fun writeByte(value: Byte)
    suspend fun writeInt(value: Int)
    suspend fun writeFloat(value: Float)
    suspend fun writeDouble(value: Double)
    suspend fun writeBoolean(value: Boolean)
    suspend fun writeUByte(value: UByte)
    suspend fun writeString(value: String)
    suspend fun writeNbtCompound(value: CompoundTag)
    suspend fun writeTextComponent(value: TextComponent)

}