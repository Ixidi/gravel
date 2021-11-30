package xyz.ixidi.gravel.v1_17_1.server

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSetSlotPacket

class ServerSetSlotPacketImpl : ServerSetSlotPacket {

    override var windowId: Byte = 0
    override var stateId: Int = 0
    override var slot: Short = 0
    override var slotData: ServerSetSlotPacket.SlotData? = null

    override suspend fun DataWriter.write() {
        writeByte(windowId)
        writeVarInt(stateId)
        writeShort(slot)
        slotData?.let {
            writeBoolean(true)
            writeVarInt(it.itemId)
            writeByte(it.itemCount.toByte())
            writeNbtCompound(it.nbt)
        }
    }

    override suspend fun DataReader.read() {
        windowId = readByte()
        stateId = readInt()
        slot = readShort()
        slotData = if (readBoolean()) {
            ServerSetSlotPacket.SlotData(readVarInt(), readByte().toInt(), readNbtCompound(false))
        } else {
            null
        }
    }
}