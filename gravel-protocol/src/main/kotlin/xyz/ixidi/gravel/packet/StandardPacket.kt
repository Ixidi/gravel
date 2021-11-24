package xyz.ixidi.gravel.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.api.packet.Packet

abstract class StandardPacket : Packet {

    private val fields = ArrayList<Field<*>>()

    private fun <T> field(read: suspend DataReader.() -> T, write: suspend DataWriter.(T) -> Unit): Field<T> {
        val field = Field(read, write)
        fields.add(field)
        return field
    }

    /**
     * Creates field with type VarInt and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by varInt()***
     */
    protected fun varInt() = field(
        read = { readVarInt() },
        write = { writeVarInt(it) }
    )

    /**
     * Creates field with type Short and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by short()***
     */
    protected fun short() = field(
        read = { readShort() },
        write = { writeShort(it) }
    )

    /**
     * Creates field with type UShort and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by uShort()***
     */
    protected fun uShort() = field(
        read = { readUShort() },
        write = { writeUShort(it) }
    )

    /**
     * Creates field with type Long and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by long()***
     */
    protected fun long() = field(
        read = { readLong() },
        write = { writeLong(it) }
    )

    /**
     * Creates field with type String and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by string()***
     */
    protected fun string() = field(
        read = { readString() },
        write = { writeString(it) }
    )

    /**
     * Creates field with type String and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by string(10)***
     * @param maxLength maxLength of expected string.
     */
    protected fun string(maxLength: Int) = field(
        read = { readString(maxLength) },
        write = { writeString(it) }
    )

    /**
     * Creates field with type extending VarIntEnum and adds it to the packet.
     * Use delegated properties:
     *
     * ***val field by varIntEnum(SomeEnum.values())***
     * @param values all possible values.
     */
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