package xyz.ixidi.gravel.core.io

import io.ktor.util.toByteArray
import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.readInt
import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.core.io.component.readTextComponent
import xyz.ixidi.gravel.core.io.nbt.readNbtCompound

class ByteReadChannelDataReader(
    private val byteReadChannel: ByteReadChannel
) : DataReader {

    override suspend fun readVarInt(): Int = byteReadChannel.readVarInt()
    override suspend fun readUShort(): UShort = byteReadChannel.readShort().toUShort()
    override suspend fun readShort(): Short = byteReadChannel.readShort()
    override suspend fun readAll(): ByteArray = byteReadChannel.toByteArray()
    override suspend fun readLong(): Long = byteReadChannel.readLong()
    override suspend fun readByte(): Byte = byteReadChannel.readByte()
    override suspend fun readInt(): Int = byteReadChannel.readInt()
    override suspend fun readDouble(): Double = byteReadChannel.readDouble()
    override suspend fun readFloat(): Float = byteReadChannel.readFloat()
    override suspend fun readBoolean(): Boolean = byteReadChannel.readBoolean()
    override suspend fun readUByte(): UByte = byteReadChannel.readByte().toUByte()
    override suspend fun readString(): String = byteReadChannel.readString()
    override suspend fun readString(maxLength: Int): String = byteReadChannel.readString(maxLength)
    override suspend fun readNbtCompound(gzip: Boolean): CompoundTag = byteReadChannel.readNbtCompound()
    override suspend fun readTextComponent(maxJsonLength: Int): TextComponent = byteReadChannel.readTextComponent(maxJsonLength)

}

fun ByteReadChannel.asDataReader(): DataReader = ByteReadChannelDataReader(this)