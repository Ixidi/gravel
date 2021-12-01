package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerSculkVibrationSignalPacket : Packet {

    var sourcePosition: Position
    var destinationIdentifier: String
    //var destination: TODO varies
    var arrivalTicks: Int

}