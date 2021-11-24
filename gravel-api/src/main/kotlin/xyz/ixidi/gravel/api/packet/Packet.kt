package xyz.ixidi.gravel.api.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter

/**
 * The way server and client communicate with each other.
 */
interface Packet {

    /**
     * Function is called everytime packet is written to remote.
     */
    suspend fun DataWriter.write()

    /**
     * Function is called everytime packet is read from remote.
     */
    suspend fun DataReader.read()

}