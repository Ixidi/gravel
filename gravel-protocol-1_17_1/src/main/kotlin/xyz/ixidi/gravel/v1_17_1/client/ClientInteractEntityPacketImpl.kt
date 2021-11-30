package xyz.ixidi.gravel.v1_17_1.client

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import xyz.ixidi.gravel.protocol.packet.play.client.ClientInteractEntityPacket

class ClientInteractEntityPacketImpl : ClientInteractEntityPacket {

    override var entityId: Int = -1
    override var type: ClientInteractEntityPacket.InteractionType = ClientInteractEntityPacket.InteractionType.INTERACT
    override var targetX: Float? = null
    override var targetY: Float? = null
    override var targetZ: Float? = null
    override var hand: ClientInteractEntityPacket.Hand? = null
    override var sneaking: Boolean = false

    override suspend fun DataWriter.write() {
        writeVarInt(entityId)
        writeVarInt(when (type) {
            ClientInteractEntityPacket.InteractionType.INTERACT -> 0
            ClientInteractEntityPacket.InteractionType.ATTACK -> 1
            ClientInteractEntityPacket.InteractionType.INTERACT_AI -> 2
        })
        if (type == ClientInteractEntityPacket.InteractionType.INTERACT_AI) {
            writeFloat(targetX!!)
            writeFloat(targetY!!)
            writeFloat(targetZ!!)
        }
        if (type == ClientInteractEntityPacket.InteractionType.INTERACT_AI || type == ClientInteractEntityPacket.InteractionType.INTERACT) {
            writeVarInt(when (hand!!) {
                ClientInteractEntityPacket.Hand.MAIN -> 0
                ClientInteractEntityPacket.Hand.OFF -> 1
            })
        }
        writeBoolean(sneaking)
    }

    override suspend fun DataReader.read() {
        entityId = readVarInt()
        type = when (readVarInt()) {
            0 -> ClientInteractEntityPacket.InteractionType.INTERACT
            1 -> ClientInteractEntityPacket.InteractionType.ATTACK
            2 -> ClientInteractEntityPacket.InteractionType.INTERACT_AI
            else -> throw Exception("Unknown id.")
        }
        if (type == ClientInteractEntityPacket.InteractionType.INTERACT_AI) {
            targetX = readFloat()
            targetY = readFloat()
            targetZ = readFloat()
        }
        if (type == ClientInteractEntityPacket.InteractionType.INTERACT_AI || type == ClientInteractEntityPacket.InteractionType.INTERACT) {
            hand = when (readVarInt()) {
                0 -> ClientInteractEntityPacket.Hand.MAIN
                1 -> ClientInteractEntityPacket.Hand.OFF
                else -> throw Exception("Unknown id.")
            }
        }
        sneaking = readBoolean()
    }

}