package xyz.ixidi.gravel.bot.service

import xyz.ixidi.gravel.api.dsl.GravelDsl
import xyz.ixidi.gravel.api.packet.Packet
import kotlin.reflect.KClass

@GravelDsl
internal class ServiceBuilder {

    private val listeners = ArrayList<ServiceListener<*>>()

    fun <P : Packet> on(clazz: KClass<P>, handler: suspend P.() -> Unit) {
        listeners.add(ServiceListener(clazz, false, handler))
    }

    inline fun <reified P : Packet> on(noinline handler: suspend P.() -> Unit) = on(P::class, handler)

    fun build() = Service(listeners)

}