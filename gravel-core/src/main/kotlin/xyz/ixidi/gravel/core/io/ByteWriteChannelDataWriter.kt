package xyz.ixidi.gravel.core.io

import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.writeFully
import xyz.ixidi.gravel.api.io.DataWriter

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
}

fun ByteWriteChannel.asDataWriter(): DataWriter = ByteWriteChannelDataWriter(this)