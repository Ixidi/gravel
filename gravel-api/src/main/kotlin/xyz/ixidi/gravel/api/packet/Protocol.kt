package xyz.ixidi.gravel.api.packet

import xyz.ixidi.gravel.api.connection.ConnectionState
import kotlin.reflect.KClass

interface Protocol {

    /**
     * Protocol's version of packets in this library.
     */
    val version: Int

    /**
     * @return [T]'s id or null if [T] is not registered in library.
     */
    fun <T : Packet> getPacketIdByClass(clazz: KClass<T>): Int?

    /**
     * Creates empty packet with [clazz] class or null if such a [Packet] is not registered.
     * @param clazz packet's class
     * @return [T] or null if not registered.
     */
    fun <T : Packet> createEmptyPacketFromClass(clazz: KClass<T>): T?

    /**
     * @param state current state od the connection.
     * @param type packet's type based on sender.
     * @param id packet's id.
     * @return [Packet] with corresponding [state] and [id] or null if none was found in library.
     */
    fun getPacketById(state: ConnectionState, type: PacketType, id: Int): Packet?

}