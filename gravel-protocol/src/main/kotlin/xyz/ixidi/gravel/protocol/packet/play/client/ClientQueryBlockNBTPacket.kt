package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ClientQueryBlockNBT : Packet {

    var transactionId: Int
    var location: Position

}