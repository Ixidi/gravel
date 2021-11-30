package xyz.ixidi.gravel.protocol.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.protocol.misc.PositionData
import java.util.UUID

abstract class StandardPacket : Packet {

    private val fields = ArrayList<Field<*>>()

    protected fun <T> field(read: suspend DataReader.() -> T, write: suspend DataWriter.(T) -> Unit): Field<T> {
        val field = BasicField(read, write)
        fields.add(field)
        return field
    }

    protected fun varInt() = field(
        read = { readVarInt() },
        write = { writeVarInt(it) }
    )

    protected fun int() = field(
        read = { readInt() },
        write = { writeInt(it) }
    )

    protected fun byte() = field(
        read = { readByte() },
        write = { writeByte(it) }
    )

    protected fun short() = field(
        read = { readShort() },
        write = { writeShort(it) }
    )

    protected fun uShort() = field(
        read = { readUShort() },
        write = { writeUShort(it) }
    )

    protected fun uByte() = field(
        read = { readUByte() },
        write = { writeUByte(it) }
    )

    protected fun boolean() = field(
        read = { readBoolean() },
        write = { writeBoolean(it) }
    )

    protected fun long() = field(
        read = { readLong() },
        write = { writeLong(it) }
    )

    protected fun double() = field(
        read = { readDouble() },
        write = { writeDouble(it) }
    )

    protected fun float() = field(
        read = { readFloat() },
        write = { writeFloat(it) }
    )

    protected fun uuid() = field(
        read = { UUID(readLong(), readLong()) },
        write = { writeLong(it.mostSignificantBits); writeLong(it.leastSignificantBits) }
    )

    protected fun string() = field(
        read = { readString() },
        write = { writeString(it) }
    )

    protected fun string(maxLength: Int) = field(
        read = { readString(maxLength) },
        write = { writeString(it) }
    )

    protected fun nbtCompound() = field(
        read = { readNbtCompound(true) },
        write = { writeNbtCompound(it) }
    )

    protected fun textComponent(maxJsonLength: Int) = field(
        read = { readTextComponent(maxJsonLength) },
        write = { writeTextComponent(it) }
    )

    protected fun <T : VarIntEnum> varIntEnum(vararg values: T) = field(
        read = {
            val varInt = readVarInt()
            values.first { it.varIntValue == varInt }
        },
        write = {
            values.first { v -> it == v }
            writeVarInt(it.varIntValue)
        }
    )

    protected fun position() = field(
        read = {
            val long = readLong()
            val x = long shr 38
            val y = long and 0xFFF
            val z = long shl 26 shr 38

            PositionData(x.toInt(), y.toInt(), z.toInt())
        },
        write = {
            val long = ((it.x.toLong() and 0x3FFFFFF) shl 38) or ((it.z.toLong() and 0x3FFFFFF) shl 12) or (it.y.toLong() and 0xFFF)
            writeLong(long)
        }
    )

    //TODO
    protected fun stringList() = field(
        read = {
            val length = readVarInt()
            val list = ArrayList<String>()
            repeat(length) {
                list.add(readString())
            }
            list.toList()
        },
        write = {
            writeVarInt(it.size)
            it.forEach { x -> writeString(x) }
        }
    )

    final override suspend fun DataWriter.write() {
        fields.forEach {
            it.run { writeField() }
        }
    }

    final override suspend fun DataReader.read() {
        fields.forEach {
            it.run { readField() }
        }
    }

}