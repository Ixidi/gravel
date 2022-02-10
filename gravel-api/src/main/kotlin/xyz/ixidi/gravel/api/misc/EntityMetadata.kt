package xyz.ixidi.gravel.api.io

import kotlin.Byte as KByte
import kotlin.Float as KFloat
import kotlin.String as KString
import kotlin.Boolean as KBoolean
import xyz.ixidi.gravel.api.component.TextComponent as GTextComponent
import xyz.ixidi.gravel.api.io.Position as GPosition
import xyz.ixidi.gravel.api.io.Particle as GParticle
import xyz.ixidi.gravel.api.misc.Pose
import xyz.ixidi.gravel.api.nbt.CompoundTag
import java.util.UUID

data class EntityMetadata(
    val entries: Map<Int, Value>
) {

    sealed interface Value {

        data class Byte(val value: KByte) : Value
        data class VarInt(val value: Int) : Value
        data class Float(val value: KFloat) : Value
        data class String(val value: KString) : Value
        data class TextComponent(val value: GTextComponent) : Value
        data class OptionalTextComponent(val value: GTextComponent?) : Value
        data class Slot(val value: SlotData) : Value
        data class Boolean(val value: KBoolean) : Value
        data class Rotation(val x: KFloat, val y: KFloat, val z: KFloat) : Value
        data class Position(val value: GPosition) : Value
        data class OptionalPosition(val value: GPosition?) : Value
        enum class Direction : Value {
            DOWN,
            UP,
            NORTH,
            SOUTH,
            WEST,
            EAST
        }
        data class OptionalUuid(val uuid: UUID?) : Value
        data class BlockId(val value: Int) : Value
        data class Nbt(val value: CompoundTag) : Value
        data class Particle(val value: GParticle) : Value
        data class Villager(val type: Type, val profession: Profession, val level: Int) : Value {

            enum class Type {
                DESERT,
                JUNGLE,
                PLAINS,
                SAVANNA,
                SNOW,
                SWAMP,
                TAIGA
            }

            enum class Profession {
                NONE,
                ARMORER,
                BUTCHER,
                CARTOGRAPHER,
                CLERIC,
                FARMER,
                FISHERMAN,
                FLETCHER,
                LEATHER_WORKER,
                LIBRARIAN,
                MASON,
                NITWIT,
                SHEPHERD,
                TOOL_SMITH,
                WEAPON_SMITH
            }

        }
        data class OptionalVarInt(val value: Int?) : Value
        data class Pose(val value: xyz.ixidi.gravel.api.misc.Pose) : Value
    }

}