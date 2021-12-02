package xyz.ixidi.gravel.api.io

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.nbt.CompoundTag
import java.util.UUID

/**
 * Writes specified data types described [here](https://wiki.vg/Data_types)
 */
interface DataWriter {

    suspend fun writeBoolean(value: Boolean)
    suspend fun writeByte(value: Byte)
    suspend fun writeUByte(value: UByte)
    suspend fun writeShort(value: Short)
    suspend fun writeUShort(value: UShort)
    suspend fun writeInt(value: Int)
    suspend fun writeLong(value: Long)
    suspend fun writeFloat(value: Float)
    suspend fun writeDouble(value: Double)
    suspend fun writeString(value: String)
    suspend fun writeTextComponent(value: TextComponent)
    suspend fun writeIdentifier(value: Identifier)
    suspend fun writeVarInt(value: Int)
    suspend fun writeVarLong(value: Long)
    //suspend fun writeEntityMetadata() TODO
    suspend fun writeSlotData(value: SlotData)
    suspend fun writeNbtCompound(value: CompoundTag)
    suspend fun writePosition(value: Position)
    suspend fun writeAngle(value: Angle)
    suspend fun writeUUID(value: UUID)
    suspend fun writeFully(value: ByteArray)

}