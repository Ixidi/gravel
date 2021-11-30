package xyz.ixidi.gravel.bot

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.launch
import mu.KotlinLogging
import xyz.ixidi.gravel.api.connection.Connection
import xyz.ixidi.gravel.api.connection.ConnectionState
import xyz.ixidi.gravel.api.connection.readWithTimeoutOrNull
import xyz.ixidi.gravel.api.connection.send
import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.bot.account.Account
import xyz.ixidi.gravel.bot.entity.EntityManager
import xyz.ixidi.gravel.bot.event.BotReadyEvent
import xyz.ixidi.gravel.bot.event.Event
import xyz.ixidi.gravel.bot.position.Position
import xyz.ixidi.gravel.bot.service.EntityUpdateService
import xyz.ixidi.gravel.bot.service.EventCallerService
import xyz.ixidi.gravel.bot.service.KeepAliveService
import xyz.ixidi.gravel.bot.service.PacketServiceManager
import xyz.ixidi.gravel.bot.service.PositionSendService
import xyz.ixidi.gravel.bot.service.PositionUpdateService
import xyz.ixidi.gravel.core.Gravel
import xyz.ixidi.gravel.protocol.packet.handshake.ClientHandshakePacket
import xyz.ixidi.gravel.protocol.packet.login.client.ClientLoginStartPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerLoginSuccessPacket
import xyz.ixidi.gravel.protocol.packet.login.server.ServerSetCompressionPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientChatMessagePacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPluginMessagePacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSettingsPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerJoinGamePacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerPlayerPositionAndLookPacket
import java.time.Duration
import kotlin.coroutines.CoroutineContext
import kotlin.reflect.KClass

val logger = KotlinLogging.logger { }

class GravelBot internal constructor(
    private val gravel: Gravel,
    private val host: String,
    private val port: Int,
    private val account: Account,
    private val mutableEventsFlow: MutableSharedFlow<Event>,
    private val receivedPacketsFlow: MutableSharedFlow<Packet>,
    coroutineContext: CoroutineContext = Dispatchers.Default
) : CoroutineScope {

    val eventsFlow: SharedFlow<Event>
        get() = mutableEventsFlow.asSharedFlow()

    override val coroutineContext: CoroutineContext = SupervisorJob() + coroutineContext
    private lateinit var connection: Connection
    private val serviceManager = PacketServiceManager(this, receivedPacketsFlow)

    private var closed = false
    private var started = false

    var position = Position(0.0, 0.0, 0.0, 0f, 0f, true)
    private set

    lateinit var entityManager: EntityManager
    private set

    fun start() {
        if (started) throw Exception("Bot has already started.")
        started = true

        entityManager = EntityManager()
        launch {
            connection = gravel.connect(host, port)
            runCatching {
                login()
            }.onFailure {
                logger.catching(it)
            }

            serviceManager.register(KeepAliveService(this@GravelBot, receivedPacketsFlow))
            serviceManager.register(EventCallerService(this@GravelBot, mutableEventsFlow, receivedPacketsFlow))
            serviceManager.register(PositionUpdateService(this@GravelBot, receivedPacketsFlow))
            serviceManager.register(EntityUpdateService(entityManager, receivedPacketsFlow))
            serviceManager.enableAll()

            val positionSendService = PositionSendService(this@GravelBot)
            serviceManager.register(positionSendService)

            launch {
                receivedPacketsFlow.first { it is ServerPlayerPositionAndLookPacket }
                serviceManager.enable(positionSendService)
                mutableEventsFlow.emit(BotReadyEvent(this@GravelBot))
            }

            launch {
                receivedPacketsFlow.first { it is ServerJoinGamePacket }
                connection.send<ClientPluginMessagePacket> {
                    channel = "minecraft:vanilla"
                    data = "vanilla".toByteArray()
                }
                connection.send<ClientSettingsPacket> {
                    locale = "en_GB"
                    viewDistance = 5
                    chatMode = ClientSettingsPacket.ChatMode.ENABLED
                    chatColors = true
                    displayedSkinPart = 0.toUByte()
                    mainHand = ClientSettingsPacket.MainHand.RIGHT
                    disableTextFiltering = true
                }
            }

            connection.incomingPackets.collect {
                receivedPacketsFlow.emit(it)
            }
        }
    }

    inline fun <reified E : Event> on(noinline handler: suspend E.() -> Unit) {
        eventsFlow
            .filterIsInstance<E>()
            .onEach {
                launch {
                    kotlin.runCatching {
                        handler(it)
                    }.onFailure {
                        logger.catching(it)
                    }
                }
            }.launchIn(this)
    }

    inline fun <reified E : Event> once(noinline handler: suspend E.() -> Unit) {
        eventsFlow
            .filterIsInstance<E>()
            .take(1)
            .onEach {
                launch {
                    kotlin.runCatching {
                        handler(it)
                    }.onFailure {
                        logger.catching(it)
                    }
                }
            }.launchIn(this)
    }

    suspend fun <T : Packet> send(clazz: KClass<T>, initializer: T.() -> Unit) {
        connection.send(clazz, initializer)
    }

    suspend inline fun <reified T : Packet> send(noinline initializer: T.() -> Unit) {
        send(T::class, initializer)
    }

    private suspend fun login() {
        send<ClientHandshakePacket> {
            nextState = ClientHandshakePacket.NextState.LOGIN
            protocolVersion = connection.protocol.version
            serverAddress = ""
            serverPort = connection.remoteAddress.port.toUShort()
        }

        connection.state = ConnectionState.LOGIN
        send<ClientLoginStartPacket> {
            name = account.name
        }

        val setCompression = connection.readWithTimeoutOrNull<ServerSetCompressionPacket>(Duration.ofMillis(4000))
        if (setCompression != null) {
            connection.enableCompression(setCompression.threshold)
        }

        connection.readWithTimeoutOrNull<ServerLoginSuccessPacket>(Duration.ofMillis(4000))
        connection.state = ConnectionState.PLAY
    }

    fun disconnect() {
        if (closed) return

        closed = true
        cancel()
    }

    private suspend fun stateRestriction(state: ConnectionState, run: suspend () -> Unit) {
        if (!::connection.isInitialized) throw Exception("Bot is not connected yet.")
        if (connection.state != state) throw Exception("This can only be used at $state state.")
        run()
    }

    suspend fun message(message: String) = stateRestriction(ConnectionState.PLAY) {
        connection.send<ClientChatMessagePacket> {
            this.message = message
        }
    }

    internal fun updatePosition(position: Position) {
        this.position = position
    }

    fun rotate(yaw: Float, pitch: Float) {
        position = position.copy(yaw = yaw, pitch = pitch)
    }

}

fun GravelBot(gravel: Gravel, account: Account, host: String, port: Int = 25565): GravelBot =
    GravelBot(
        gravel,
        host,
        port,
        account,
        MutableSharedFlow(extraBufferCapacity = Channel.UNLIMITED),
        MutableSharedFlow(extraBufferCapacity = Channel.UNLIMITED)
    )
