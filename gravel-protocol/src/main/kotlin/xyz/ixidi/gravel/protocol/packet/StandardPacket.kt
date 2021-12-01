package xyz.ixidi.gravel.protocol.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.protocol.packet.play.server.ServerJoinGamePacket
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty1

abstract class StandardPacket : Packet {

    private val fields = ArrayList<Field<*>>()

    protected fun <T> field(read: suspend DataReader.() -> T, write: suspend DataWriter.(T) -> Unit): Field<T> {
        val field = BasicField(read, write)
        fields.add(field)
        return field
    }

    protected fun <T> list(read: suspend DataReader.() -> T, write: suspend DataWriter.(T) -> Unit) = field(
        read = {
            val length = readVarInt()
            val list = ArrayList<T>()
            repeat(length) {
                list.add(read())
            }
            list.toList()
        },
        write = {
            writeVarInt(it.size)
            it.forEach { f -> write(f) }
        }
    )

    protected fun boolean() = field(
        read = { readBoolean() },
        write = { writeBoolean(it) }
    )

    protected fun byte() = field(
        read = { readByte() },
        write = { writeByte(it) }
    )

    protected fun uByte() = field(
        read = { readUByte() },
        write = { writeUByte(it) }
    )

    protected fun short() = field(
        read = { readShort() },
        write = { writeShort(it) }
    )

    protected fun uShort() = field(
        read = { readUShort() },
        write = { writeUShort(it) }
    )

    protected fun int() = field(
        read = { readInt() },
        write = { writeInt(it) }
    )

    protected fun long() = field(
        read = { readLong() },
        write = { writeLong(it) }
    )

    protected fun float() = field(
        read = { readFloat() },
        write = { writeFloat(it) }
    )

    protected fun double() = field(
        read = { readDouble() },
        write = { writeDouble(it) }
    )

    protected fun string() = field(
        read = { readString() },
        write = { writeString(it) }
    )

    protected fun string(maxLength: Int) = field(
        read = { readString(maxLength) },
        write = { writeString(it) }
    )

    protected fun textComponent(maxJsonLength: Int) = field(
        read = { readTextComponent(maxJsonLength) },
        write = { writeTextComponent(it) }
    )

    protected fun varInt() = field(
        read = { readVarInt() },
        write = { writeVarInt(it) }
    )

    protected fun varLong() = field(
        read = { readVarLong() },
        write = { writeVarLong(it) }
    )

    ///protected fun slot() = TODO()

    protected fun nbtCompound() = field(
        read = { readNbtCompound() },
        write = { writeNbtCompound(it) }
    )

    protected fun position() = field(
        read = { readPosition() },
        write = { writePosition(it) }
    )

    protected fun angle() = field(
        read = { readAngle() },
        write = { writeAngle(it) }
    )

    protected fun uuid() = field(
        read = { readUUID() },
        write = { writeUUID(it) }
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

    protected inline fun <reified E : Enum<E>, T> Field<T>.enum(correspondingProperty: KMutableProperty1<E, T>): Field<E> = mapped(
        convertFrom = { correspondingProperty(it) },
        convertTo = { enumValues<E>().first { e -> correspondingProperty(e) == it } }
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