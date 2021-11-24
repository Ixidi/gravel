package xyz.ixidi.gravel.api.connection

import xyz.ixidi.gravel.api.packet.Packet
import kotlin.reflect.KClass

class UnknownPacketException(val clazz: KClass<out Packet>) : Exception("Unknown packet ${clazz.simpleName} was tried to be sent.")