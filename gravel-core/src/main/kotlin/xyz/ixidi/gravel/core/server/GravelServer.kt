package xyz.ixidi.gravel.core.server

import io.ktor.network.sockets.ServerSocket
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.core.Gravel
import xyz.ixidi.gravel.core.connection.ConnectionImpl
import kotlin.coroutines.CoroutineContext

class GravelServer(
    private val serverSocket: ServerSocket,
    private val protocol: Protocol,
    private val onNewConnection: (Connection) -> Unit,
    private val onDisconnected: (Connection) -> Unit,
    coroutineContext: CoroutineContext = Dispatchers.Default
) : CoroutineScope {

    override val coroutineContext: CoroutineContext = coroutineContext + SupervisorJob()
    
    private var isClosed = false
    
    internal fun start() {
        launch { 
            while (!isClosed) {
                val s = serverSocket.accept()
                val connection = ConnectionImpl(protocol, s, PacketType.CLIENT) {
                    onDisconnected(it)
                }
                onNewConnection(connection)
            }
        }
    }
    
    fun close() {
        if (isClosed) return
        isClosed = true
        cancel()
        serverSocket.close()
    }

}