package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.dsl.GravelDsl
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.PacketType
import kotlin.reflect.KClass

@GravelDsl
class PacketSetBuilder internal constructor(
    private val state: ConnectionState,
    private val type: PacketType
) {

    class DuplicatedPacketException(val id: Int) : Exception("Duplicated packet with id $id.")

    private val packets = ArrayList<PacketInfo<*>>()

    /**
     * Add packet to this set.
     * @param id packet's id
     * @param clazz packet's class
     * @param builder builder witch is used to create empty packet
     */
    fun <T : Packet> packet(id: Int, clazz: KClass<T>, builder: () -> T) {
        if (packets.any { it.id == id }) throw DuplicatedPacketException(id)

        packets.add(PacketInfo(id, type, state, clazz, builder))
    }

    /**
     * Add packet to this set.
     * @param id packet's id
     * @param builder builder witch is used to create empty packet
     */
    inline fun <reified T : Packet> packet(id: Int, noinline builder: () -> T) = packet(id, T::class, builder)

    internal fun build() = packets.toList()

}