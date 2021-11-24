package xyz.ixidi.gravel.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.api.dsl.GravelDsl

@GravelDsl
class GravelBuilder internal constructor() {

    private val protocols = ArrayList<Protocol>()
    var dispatcher: CoroutineDispatcher = Dispatchers.Default

    /**
     * Adds new protocol to supported.
     * @param protocol [Protocol] for specified [protocol]
     */
    fun protocol(protocol: Protocol) {
        if (protocols.any { it.version == protocol.version }) throw Exception("Duplicated protocol version ${protocol.version}.")
        protocols.add(protocol)
    }

    internal fun build() = Gravel(protocols, dispatcher)

}