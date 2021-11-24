package xyz.ixidi.gravel.api.io

/**
 * Writes specified data types described [here](https://wiki.vg/Data_types)
 */
interface DataWriter {

    suspend fun writeVarInt(value: Int)
    suspend fun writeUShort(value: UShort)
    suspend fun writeShort(value: Short)
    suspend fun writeFully(value: ByteArray)
    suspend fun writeLong(value: Long)
    suspend fun writeString(value: String)

}