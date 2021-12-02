package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.packet.Packet

import kotlin.Double as KDouble
import kotlin.Float as KFloat
import kotlin.Long as KLong
import kotlin.String as KString

interface ServerDeclareCommandsPacket : Packet {

    sealed class Parser(val identifier: Identifier) {

        constructor(identifier: KString) : this(Identifier(identifier))

        object Bool : Parser("brigadier:bool")
        class Double(val min: KDouble = KDouble.MIN_VALUE, val max: KDouble = KDouble.MAX_VALUE) : Parser("brigadier:double")
        class Float(val min: KFloat = KFloat.MIN_VALUE, val max: KFloat = KFloat.MAX_VALUE) : Parser("brigadier:float")
        class Integer(val min: Int = Int.MIN_VALUE, val max: Int = Int.MAX_VALUE) : Parser("brigadier:integer")
        class Long(val min: KLong = KLong.MIN_VALUE, val max: KLong = KLong.MAX_VALUE) : Parser("brigadier:long")
        class String(val type: Type) : Parser("brigadier:string") {
            enum class Type {
                SINGLE_WORD,
                QUOTABLE_PHRASE,
                GREEDY_PHRASE
            }
        }
        class Entity(val onlySingleEntity: Boolean, val onlyPlayer: Boolean) : Parser("minecraft:entity")
        object GameProfile : Parser("minecraft:game_profile")
        object BlockPos : Parser("minecraft:block_pos")
        object ColumnPos : Parser("minecraft:column_pos")
        object Vec3 : Parser("minecraft:vec3")
        object Vec2 : Parser("minecraft:vec2")
        object BlockState : Parser("minecraft:block_state")
        object BlockPredicate : Parser("minecraft:block_predicate")
        object ItemStack : Parser("minecraft:item_stack")
        object ItemPredicate : Parser("minecraft:item_predicate")
        object Color : Parser("minecraft:color")
        object Component : Parser("minecraft:component")
        object Message : Parser("minecraft:message")
        object Nbt : Parser("minecraft:nbt")
        object NbtPath : Parser("minecraft:nbt_path")
        object Objective : Parser("minecraft:objective")
        object ObjectiveCriteria : Parser("minecraft:objective_criteria")
        object Operation : Parser("minecraft:operation")
        object Particle : Parser("minecraft:particle")
        object Rotation : Parser("minecraft:rotation")
        object Angle : Parser("minecraft:angle")
        object ScoreboardSlot : Parser("minecraft:scoreboard_slot")
        class ScoreHolder(val allowsMultiple: Boolean) : Parser("minecraft:score_holder")
        object Swizzle : Parser("minecraft:swizzle")
        object Team : Parser("minecraft:team")
        object ItemSlot : Parser("minecraft:item_slot")
        object ResourceLocation : Parser("minecraft:resource_location")
        object MobEffect : Parser("minecraft:mob_effect")
        object Function : Parser("minecraft:function")
        object EntityAnchor : Parser("minecraft:entity_anchor")
        class Range(val decimals: Boolean) : Parser("minecraft:range")
        object IntRange : Parser("minecraft:int_range")
        object FloatRange : Parser("minecraft:float_range")
        object ItemEnchantment : Parser("minecraft:item_enchantment")
        object EntitySummon : Parser("minecraft:entity_summon")
        object Dimension : Parser("minecraft:dimension")
        object Uuid : Parser("minecraft:uuid")
        object NbtTag : Parser("minecraft:nbt_tag")
        object NbtCompoundTag : Parser("minecraft:nbt_compound_tag")
        object Time : Parser("minecraft:time")

    }

    data class Node(
        val type: Type,
        val isExecutable: Boolean,
        val hasRedirect: Boolean,
        val hasSuggestionsType: Boolean,
        val children: List<Int>,
        val redirectNode: Int?,
        val name: KString?,
        val parser: Parser?,
        val suggestionsType: Identifier
    ) {

        enum class Type {
            ROOT,
            LITERAL,
            ARGUMENT
        }

    }

    var nodes: List<Node>
    var rootIndex: Int

}