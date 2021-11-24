package xyz.ixidi.gravel.core

import kotlinx.coroutines.delay
import xyz.ixidi.gravel.core.status.status
import xyz.ixidi.gravel.protocol.Protocols

suspend fun main() {
    val gravel = Gravel { }
    println(gravel.fetchStatus("mc-pl.net", 25565))
    gravel.server(25565, Protocols.status) {
        onNewConnection {
            it.close()
        }

        onDisconnected {
            println("disconnected")
        }
    }
    delay(100000)
}