package xyz.ixidi.gravel.core.server

import io.ktor.network.sockets.ServerSocket
import io.ktor.network.sockets.isClosed
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
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
    private val onDisconnected: (Connection) -> Unit,
    coroutineContext: CoroutineContext = Dispatchers.Default
) : CoroutineScope {

    override val coroutineContext: CoroutineContext = coroutineContext + SupervisorJob()

    lateinit var incomingConnections: Flow<Connection>
    private set

    private var isClosed = false
    
    internal fun start() {
        if (serverSocket.isClosed) throw Exception("SeverSocket is closed.")

        incomingConnections = flow {
            while (!isClosed) {
                val s = serverSocket.accept()
                val connection = ConnectionImpl(protocol, s, PacketType.CLIENT, { onDisconnected(it) }, coroutineContext)
                connection.start()
                emit(connection)
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