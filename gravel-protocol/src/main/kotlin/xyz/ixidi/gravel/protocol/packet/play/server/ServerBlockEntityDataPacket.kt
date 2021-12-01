package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.api.packet.Packet

interface ServerBlockEntityDataPacket : Packet {

    var location: Position
    val action: UByte
    var nbtData: CompoundTag

}