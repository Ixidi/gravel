package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.SlotData
import xyz.ixidi.gravel.api.packet.Packet

interface ServerTradeListPacket : Packet {

    data class Trade(
        val firstInput: SlotData,
        val firstOutput: SlotData,
        val secondInput: SlotData?,
        val tradeDisabled: Boolean,
        val numberOfTradeUses: Int,
        val maximumNumberOfTradeUses: Int,
        val xp: Int,
        val specialPrice: Int,
        val priceMultiplier: Float,
        val demand: Int
    )

    var windowId: Int
    var trades: List<Trade>
    var villagerLevel: Int
    var experience: Int
    var isRegularVillager: Boolean
    var canRestock: Boolean

}