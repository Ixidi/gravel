package xyz.ixidi.gravel.core.io

import io.ktor.util.toByteArray
import io.ktor.utils.io.ByteReadChannel
import xyz.ixidi.gravel.api.io.DataReader

class ByteReadChannelDataReader(
    private val byteReadChannel: ByteReadChannel
) : DataReader {

    override suspend fun readVarInt(): Int = byteReadChannel.readVarInt()
    override suspend fun readUShort(): UShort = byteReadChannel.readShort().toUShort()
    override suspend fun readShort(): Short = byteReadChannel.readShort()
    override suspend fun readAll(): ByteArray = byteReadChannel.toByteArray()
    override suspend fun readLong(): Long = byteReadChannel.readLong()
    override suspend fun readString(): String = byteReadChannel.readString()
    override suspend fun readString(maxLength: Int): String = byteReadChannel.readString(maxLength)

}

fun ByteReadChannel.asDataReader(): DataReader = ByteReadChannelDataReader(this)