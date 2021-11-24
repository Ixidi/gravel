package xyz.ixidi.gravel.api.io

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
    suspend fun readString(maxLength: Int): String

}