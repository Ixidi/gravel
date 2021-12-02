package xyz.ixidi.gravel.api.io

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.nbt.CompoundTag
import java.util.UUID

/**
 * Reads specified data types described [here](https://wiki.vg/Data_types)
 */
interface DataReader {

    suspend fun readBoolean(): Boolean
    suspend fun readByte(): Byte
    suspend fun readUByte(): UByte
    suspend fun readShort(): Short
    suspend fun readUShort(): UShort
    suspend fun readInt(): Int
    suspend fun readLong(): Long
    suspend fun readFloat(): Float
    suspend fun readDouble(): Double
    suspend fun readString(): String
    suspend fun readString(maxLength: Int): String
    suspend fun readTextComponent(maxJsonLength: Int): TextComponent
    suspend fun readIdentifier(): Identifier
    suspend fun readVarInt(): Int
    suspend fun readVarLong(): Long
    // suspend fun readEntityMetadata() TODO MUCH work in transferring to OOP, later
    suspend fun readSlotData(): SlotData
    suspend fun readNbtCompound(): CompoundTag
    suspend fun readPosition(): Position
    suspend fun readAngle(): Angle
    suspend fun readUUID(): UUID
    suspend fun readAll(): ByteArray

}