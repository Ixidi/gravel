package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import xyz.ixidi.gravel.api.packet.Packet

class PacketServiceManager(
    private val servicesScope: CoroutineScope,
    private val packetsFlow: Flow<Packet>
) {

    private val services = ArrayList<Service>()

    fun register(service: Service) {
        if (services.any { it::class == service::class }) throw Exception("Service already registered.")
        services.add(service)
    }

    fun enableOnce(service: Service, predicate: (Packet) -> Boolean) {
        if (service !in services) throw Exception("Service is not registered.")

        servicesScope.launch {
            packetsFlow.first { predicate(it) }
            if (!service.isRunning) service.start(servicesScope)
        }
    }

    fun enable(service: Service) {
        if (service !in services) throw Exception("Service is not registered.")
        if (!service.isRunning) service.start(servicesScope)
    }

    fun enableAll() {
        services
            .filter { !it.isRunning }
            .forEach { it.start(servicesScope) }
    }

    fun disableAll() {
        services
            .filter { it.isRunning }
            .forEach { it.stop() }
    }

}