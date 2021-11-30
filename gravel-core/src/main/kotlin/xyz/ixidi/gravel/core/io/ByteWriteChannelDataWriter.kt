package xyz.ixidi.gravel.core.io

import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.writeBoolean
import io.ktor.utils.io.writeFully
import io.ktor.utils.io.writeInt
import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.api.nbt.CompoundTag

internal class ByteWriteChannelDataWriter(
    private val byteWriteChannel: ByteWriteChannel
) : DataWriter {

    override suspend fun writeVarInt(value: Int) {
        byteWriteChannel.writeVarInt(value)
    }

    override suspend fun writeUShort(value: UShort) {
        byteWriteChannel.writeShort(value.toShort())
    }

    override suspend fun writeShort(value: Short) {
        byteWriteChannel.writeShort(value)
    }

    override suspend fun writeFully(value: ByteArray) {
        byteWriteChannel.writeFully(value)
    }

    override suspend fun writeString(value: String) {
        byteWriteChannel.writeString(value)
    }

    override suspend fun writeLong(value: Long) {
        byteWriteChannel.writeLong(value)
    }

    override suspend fun writeByte(value: Byte) {
        byteWriteChannel.writeByte(value)
    }

    override suspend fun writeInt(value: Int) {
        byteWriteChannel.writeInt(value)
    }

    override suspend fun writeFloat(value: Float) {
        byteWriteChannel.writeFloat(value)
    }

    override suspend fun writeDouble(value: Double) {
        byteWriteChannel.writeDouble(value)
    }

    override suspend fun writeBoolean(value: Boolean) {
        byteWriteChannel.writeBoolean(value)
    }

    override suspend fun writeUByte(value: UByte) {
        byteWriteChannel.writeByte(value.toByte())
    }

    override suspend fun writeNbtCompound(value: CompoundTag) {
        TODO()
    }

    override suspend fun writeTextComponent(value: TextComponent) {
        TODO("Not yet implemented")
    }
}

fun ByteWriteChannel.asDataWriter(): DataWriter = ByteWriteChannelDataWriter(this)