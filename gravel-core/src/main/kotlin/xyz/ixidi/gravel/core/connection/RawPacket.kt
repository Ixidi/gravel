package xyz.ixidi.gravel.core.connection

import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.api.packet.Packet

internal data class RawPacket(
    val id: Int,
    val state: ConnectionState
) : Packet {

    lateinit var rawData: ByteArray
    private set

    override suspend fun DataWriter.write() {
        writeFully(rawData)
    }

    override suspend fun DataReader.read() {
        rawData = readAll()
    }

}