package xyz.ixidi.gravel.api.io

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.nbt.CompoundTag

/**
 * Reads specified data types described [here](https://wiki.vg/Data_types)
 */
interface DataReader {

    suspend fun readVarInt(): Int
    suspend fun readUShort(): UShort
    suspend fun readShort(): Short
    suspend fun readAll(): ByteArray
    suspend fun readString(): String
    suspend fun readLong(): Long
    suspend fun readByte(): Byte
    suspend fun readInt(): Int
    suspend fun readDouble(): Double
    suspend fun readFloat(): Float
    suspend fun readBoolean(): Boolean
    suspend fun readUByte(): UByte
    suspend fun readString(maxLength: Int): String
    suspend fun readNbtCompound(gzip: Boolean): CompoundTag
    suspend fun readTextComponent(maxJsonLength: Int): TextComponent

}