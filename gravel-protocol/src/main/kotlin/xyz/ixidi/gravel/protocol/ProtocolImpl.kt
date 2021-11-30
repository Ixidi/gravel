package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.api.packet.Protocol
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

internal class ProtocolImpl(
    override val version: Int,
    private val packetInfos: List<PacketInfo<*>>
) : Protocol {

    override fun <T : Packet> getPacketIdByClass(clazz: KClass<T>): Int? =
        packetInfos.firstOrNull { it.clazz == clazz }?.id

    override fun <T : Packet> createEmptyPacketImplementation(clazz: KClass<T>): T? =
        packetInfos.firstOrNull { it.clazz.isSubclassOf(clazz) }?.builder?.invoke() as T

    override fun getPacketById(state: ConnectionState, type: PacketType, id: Int): Packet? =
        packetInfos.firstOrNull { it.state == state && it.type == type && it.id == id }?.builder?.invoke()

}