package xyz.ixidi.gravel.api.connection

/**
 * Represents current state of the connection.
 */
enum class ConnectionState {

    HANDSHAKE,
    STATUS,
    LOGIN,
    PLAY;

}