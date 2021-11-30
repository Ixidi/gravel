package xyz.ixidi.gravel.core

import io.ktor.network.selector.ActorSelectorManager
import io.ktor.network.sockets.aSocket
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withTimeout
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.connection.send
import xyz.ixidi.gravel.api.packet.PacketType
import xyz.ixidi.gravel.api.packet.Protocol
import xyz.ixidi.gravel.core.connection.AddressResolver
import xyz.ixidi.gravel.core.connection.ConnectionImpl
import xyz.ixidi.gravel.core.server.GravelServer
import xyz.ixidi.gravel.core.server.GravelServerBuilder
import xyz.ixidi.gravel.protocol.packet.status.client.ClientRequestPacket
import xyz.ixidi.gravel.protocol.packet.status.server.ServerResponsePacket
import xyz.ixidi.gravel.protocol.packet.handshake.ClientHandshakePacket
import xyz.ixidi.gravel.core.status.ServerStatus
import xyz.ixidi.gravel.protocol.basic
import xyz.ixidi.gravel.protocol.Protocols
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class Gravel internal constructor(
    private val protocols: List<Protocol>,
    dispatcher: CoroutineDispatcher = Dispatchers.Default
) : CoroutineScope {

    class UnsupportedProtocolException(val protocolVersion: Int) : Exception("Protocol $protocolVersion is not supported.")

    override val coroutineContext: CoroutineContext = SupervisorJob() + dispatcher

    private val aSocket = aSocket(ActorSelectorManager(Dispatchers.IO)).tcp()
    private val json = Json { ignoreUnknownKeys = true }

    suspend fun connect(host: String, port: Int, protocol: Protocol? = null): Connection {
        val connectionProtocol = if (protocol == null) {
            val status = fetchStatus(host, port)
            val protocolVersion = status.version.protocol
            protocols.firstOrNull { it.version == protocolVersion } ?: throw UnsupportedProtocolException(protocolVersion)
        } else protocol

        val socket = aSocket.connect(AddressResolver.resolve(host, port))
        val connection = ConnectionImpl(connectionProtocol, socket, PacketType.SERVER, { }, coroutineContext)
        connection.start()
        return connection
    }

    suspend fun fetchStatus(host: String, port: Int, timeout: Duration = Duration.ofMillis(4000)): ServerStatus {
        val connection = connect(host, port, Protocols.basic)

        val result = runCatching {
            connection.send<ClientHandshakePacket> {
                protocolVersion = -1
                serverAddress = ""
                serverPort = port.toUShort()
                nextState = ClientHandshakePacket.NextState.STATUS
            }

            connection.state = ConnectionState.STATUS
            connection.send<ClientRequestPacket> { }

            withTimeout(timeout.toMillis()) {
                connection.incomingPackets
                    .filterIsInstance<ServerResponsePacket>()
                    .first()
            }
        }
        connection.close()

        val json = result.getOrThrow().jsonResponse
        return this.json.decodeFromString(json)
    }

    fun server(port: Int, protocol: Protocol, builder: GravelServerBuilder.() -> Unit): GravelServer {
        val server = aSocket.bind(port = port)
        val b = GravelServerBuilder()
        b.builder()

        val gravelServer = GravelServer(server, protocol, b.onDisconnected)
        gravelServer.start()

        return gravelServer
    }

}

fun Gravel(builder: GravelBuilder.() -> Unit): Gravel {
    val b = GravelBuilder()
    builder(b)
    return b.build()
}