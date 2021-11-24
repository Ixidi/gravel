package xyz.ixidi.gravel.core.status

import kotlinx.serialization.Serializable
import xyz.ixidi.gravel.core.util.UUIDSerializer
import java.util.UUID

@Serializable
data class ServerStatus(
    val version: Version,
    val players: Players,
    val description: Description,
    val favicon: String?
) {

    @Serializable
    data class Version(
        val name: String,
        val protocol: Int
    )

    @Serializable
    data class Players(
        val max: Int,
        val online: Int,
        val sample: List<Sample> = emptyList()
    ) {

        @Serializable
        data class Sample(
            val name: String,
            @Serializable(with = UUIDSerializer::class)
            val uuid: UUID
        )

    }

    @Serializable
    data class Description(
        val text: String
    )

}