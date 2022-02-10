package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientQueryEntityNBT : Packet {

    var transactionId: Int
    var entityId: Int

}