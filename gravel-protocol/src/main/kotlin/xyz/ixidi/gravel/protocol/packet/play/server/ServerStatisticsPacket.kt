package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerStatisticsPacket : Packet {

    data class Statistic(
        val categoryId: Int,
        val statisticId: Int,
        val value: Int
    )

    var statistics: List<Statistic>

}