package xyz.ixidi.gravel.core.io.nbt

import io.ktor.util.cio.KtorDefaultPool
import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.readFully
import io.ktor.utils.io.writer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import xyz.ixidi.gravel.api.nbt.ByteArrayTag
import xyz.ixidi.gravel.api.nbt.ByteTag
import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.api.nbt.DoubleTag
import xyz.ixidi.gravel.api.nbt.FloatTag
import xyz.ixidi.gravel.api.nbt.IntArrayTag
import xyz.ixidi.gravel.api.nbt.IntTag
import xyz.ixidi.gravel.api.nbt.ListTag
import xyz.ixidi.gravel.api.nbt.LongArrayTag
import xyz.ixidi.gravel.api.nbt.LongTag
import xyz.ixidi.gravel.api.nbt.ShortTag
import xyz.ixidi.gravel.api.nbt.StringTag
import xyz.ixidi.gravel.api.nbt.Tag

suspend fun ByteReadChannel.readNbtCompound(gzip: Boolean = true): CompoundTag {
    if (readByte().toInt() != TagId.compound) throw NBTParsingException("Compound tag was expected.")
    val name = readString()

    return readCompound(name)
}

private suspend fun ByteReadChannel.readTag(name: String, id: Int): Tag = when (id) {
    TagId.compound -> readCompound(name)
    TagId.byte -> ByteTag(name, readByte())
    TagId.short -> ShortTag(name, readShort())
    TagId.int -> IntTag(name, readInt())
    TagId.long -> LongTag(name, readLong())
    TagId.float -> FloatTag(name, readFloat())
    TagId.double -> DoubleTag(name, readDouble())
    TagId.string -> StringTag(name, readString())
    TagId.byteArray -> {
        val size = readInt()
        val byteArray = ByteArray(size)
        readFully(byteArray)
        ByteArrayTag(name, byteArray)
    }
    TagId.intArray -> {
        val size = readInt()
        val intArray = IntArray(size) { readInt() }
        IntArrayTag(name, intArray)
    }
    TagId.longArray -> {
        val size = readInt()
        val longArray = LongArray(size) { readLong() }
        LongArrayTag(name, longArray)
    }
    TagId.list -> {
        val typeId = readByte().toInt()
        if (typeId < TagId.firstId || typeId > TagId.lastId) throw NBTParsingException("Unknown tag id $id.")

        val length = readInt()
        if (typeId == TagId.end && length <= 0) throw NBTParsingException("TypeId can only be End when length is 0.")

        val list = ArrayList<Tag>()
        repeat(length) {
            list.add(readTag("", typeId))
        }

        ListTag(name, list)
    }
    else -> throw NBTParsingException("Unknown tag id $id.")
}

private suspend fun ByteReadChannel.readCompound(compoundName: String): CompoundTag {
    val children = ArrayList<Tag>()

    while (true) {
        val id = readByte().toInt()
        if (id == TagId.end) break

        val name = readString()
        val tag = readTag(name, id)

        children.add(tag)
    }
    return CompoundTag(compoundName, children.toList())
}

private suspend fun ByteReadChannel.readString(): String {
    val nameLength = readShort().toInt()

    return if (nameLength > 0) {
        val nameBytes = ByteArray(nameLength)
        readFully(nameBytes)
        nameBytes.decodeToString()
    } else ""
}
