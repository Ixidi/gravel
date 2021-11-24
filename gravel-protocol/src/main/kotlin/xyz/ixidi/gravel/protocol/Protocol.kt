package xyz.ixidi.gravel.protocol

import xyz.ixidi.gravel.api.packet.Protocol

/**
 * DSL builder that creates protocol for specified [version]
 */
fun Protocol(version: Int, builder: ProtocolBuilder.() -> Unit): Protocol {
    val b = ProtocolBuilder(version)
    builder(b)
    return b.build()
}