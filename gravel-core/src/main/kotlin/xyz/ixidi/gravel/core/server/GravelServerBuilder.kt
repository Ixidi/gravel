package xyz.ixidi.gravel.core.server

import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.dsl.GravelDsl

@GravelDsl
class GravelServerBuilder {

    internal var onDisconnected: (Connection) -> Unit = {}

    fun onDisconnected(handler: (Connection) -> Unit) {
        onDisconnected = handler
    }

}