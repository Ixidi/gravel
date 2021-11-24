package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.api.packet.PacketType
import kotlin.reflect.KClass

internal data class PacketInfo<T : Packet>(
    val id: Int,
    val type: PacketType,
    val state: ConnectionState,
    val clazz: KClass<T>,
    val builder: () -> T
)