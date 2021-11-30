import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import xyz.ixidi.gravel.api.component.rawString
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.bot.account.Account
import xyz.ixidi.gravel.bot.event.BotReadyEvent
import xyz.ixidi.gravel.bot.event.ChatMessageEvent
import xyz.ixidi.gravel.bot.event.PacketReceivedEvent
import xyz.ixidi.gravel.core.Gravel
import xyz.ixidi.gravel.protocol.packet.play.client.ClientAnimationPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientInteractEntityPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerSpawnEntityPacket
import xyz.ixidi.gravel.protocol.Protocols
import xyz.ixidi.gravel.protocol.misc.BlockFace
import xyz.ixidi.gravel.protocol.misc.PositionData
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerBlockPlacementPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityPositionPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerEntityTeleportPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerOpenWindowsPacket
import xyz.ixidi.gravel.v1_17_1.v1_17_1

fun main() {
    runBlocking {
        val gravel = Gravel {
            protocol(Protocols.v1_17_1)
        }

        val bot = GravelBot(gravel, Account.Cracked("PompkaWodna"), "iskyblock.pl", 25565)
        bot.once<BotReadyEvent> {
            bot.message("/login 111111")
            delay(1000)
            bot.message("/is home pompka")
        }

        val mineCartTypeId = 50

        bot.on<ChatMessageEvent> {
            println(text.rawString())
        }

        bot.on<PacketReceivedEvent> {
            val p = packet
            if (p is ServerOpenWindowsPacket) {
                println(p.windowTitle.rawString())
            }
        }
        bot.start()

        flow {
            while (true) {
                emit(readLine())
            }
        }.filter { it != null }.map { it!! }
            .collect {
                val split = it.split(" ")
                when (split[0]) {
                    "command" -> {
                        if (split.size < 2) return@collect
                        bot.message("/${split.subList(1, split.size).joinToString(" ")}")
                    }
                    "rotate" -> {
                        if (split.size < 3) return@collect
                        bot.rotate(split[1].toFloat(), split[2].toFloat())
                    }
                    "use" -> {
                        bot.send<ClientAnimationPacket> {
                            mainHand = true
                        }
                    }
                    "cart" -> {
                        bot.send<ClientInteractEntityPacket> {
                            entityId = bot.entityManager.getAllEntities().first { it.typeId == mineCartTypeId }.entityId
                            type = ClientInteractEntityPacket.InteractionType.INTERACT
                            hand = ClientInteractEntityPacket.Hand.MAIN
                            sneaking = false
                        }
                    }
                    "start" -> {
                        bot.send<ClientInteractEntityPacket> {
                            entityId = bot.entityManager.getAllEntities().first { it.typeId == mineCartTypeId }.entityId
                            type = ClientInteractEntityPacket.InteractionType.INTERACT
                            hand = ClientInteractEntityPacket.Hand.MAIN
                            sneaking = false
                        }
                        delay(1000)
                        bot.rotate(270f, 0f)
                        while (true) {
                            delay(50)
                            bot.send<ClientPlayerBlockPlacementPacket> {
                                mainHand = true
                                blockFace = BlockFace.EAST
                                val pos = bot.entityManager.getAllEntities().first { it.typeId == mineCartTypeId }.position
                                println(pos)
                                blockPosition = PositionData(pos.x.toInt() + 1, pos.y.toInt() + 1, pos.z.toInt())
                                cursorPositionX = 1f
                                cursorPositionY = 0.5f
                                cursorPositionZ = 0.5f
                                insideBlock = false
                            }
                            bot.send<ClientAnimationPacket> {
                                mainHand = true
                            }
                        }
                    }
                }
            }
    }
}