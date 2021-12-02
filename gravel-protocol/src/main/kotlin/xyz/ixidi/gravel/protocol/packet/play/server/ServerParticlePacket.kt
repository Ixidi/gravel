package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.io.SlotData
import xyz.ixidi.gravel.api.packet.Packet

interface ServerParticlePacket : Packet {

    sealed class Particle(val identifier: Identifier) {

        constructor(identifier: String) : this(Identifier(identifier))

        object AmbientEntityEffect : Particle("minecraft:ambient_entity_effect")
        object AngryVillager : Particle("minecraft:angry_villager")
        object Barrier : Particle("minecraft:barrier")
        object Light : Particle("minecraft:light")
        class Block(val blockState: Int) : Particle("minecraft:block")
        object Bubble : Particle("minecraft:bubble")
        object Cloud : Particle("minecraft:cloud")
        object Crit : Particle("minecraft:crit")
        object DamageIndicator : Particle("minecraft:damage_indicator")
        object DragonBreath : Particle("minecraft:dragon_breath")
        object DrippingLava : Particle("minecraft:dripping_lava")
        object FallingLava : Particle("minecraft:falling_lava")
        object LandingLava : Particle("minecraft:landing_lava")
        object DrippingWater : Particle("minecraft:dripping_water")
        object FallingWater : Particle("minecraft:falling_water")
        class Dust(val red: Float, val green: Float, val blue: Float, val scale: Float) : Particle("minecraft:dust")
        class DustColorTransition(
            val fromRed: Float,
            val fromGreen: Float,
            val fromBlue: Float,
            val scale: Float,
            val toRed: Float,
            val toGreen: Float,
            val toBlue: Float
        ) : Particle("minecraft:dust_color_transition")

        object Effect : Particle("minecraft:effect")
        object ElderGuardian : Particle("minecraft:elder_guardian")
        object EnchantedHit : Particle("minecraft:enchanted_hit")
        object Enchant : Particle("minecraft:enchant")
        object EndRod : Particle("minecraft:end_rod")
        object EntityEffect : Particle("minecraft:entity_effect")
        object ExplosionEmitter : Particle("minecraft:explosion_emitter")
        object Explosion : Particle("minecraft:explosion")
        class FallingDust(val blockState: Int) : Particle("minecraft:falling_dust")
        object Firework : Particle("minecraft:firework")
        object Fishing : Particle("minecraft:fishing")
        object Flame : Particle("minecraft:flame")
        object SoulFireFlame : Particle("minecraft:soul_fire_flame")
        object Soul : Particle("minecraft:soul")
        object Flash : Particle("minecraft:flash")
        object HappyVillager : Particle("minecraft:happy_villager")
        object Composter : Particle("minecraft:composter")
        object Heart : Particle("minecraft:heart")
        object InstantEffect : Particle("minecraft:instant_effect")
        class Item(val item: SlotData) : Particle("minecraft:item")
        class Vibration(
            val originX: Double,
            val originY: Double,
            val originZ: Double,
            val destX: Double,
            val destY: Double,
            val destZ: Double,
            val ticks: Int
        ) : Particle("minecraft:vibration")
        object ItemSlime : Particle("minecraft:item_slime")
        object ItemSnowball : Particle("minecraft:item_snowball")
        object LargeSmoke : Particle("minecraft:large_smoke")
        object Lava : Particle("minecraft:lava")
        object Mycelium : Particle("minecraft:mycelium")
        object Note : Particle("minecraft:note")
        object Poof : Particle("minecraft:poof")
        object Portal : Particle("minecraft:portal")
        object Rain : Particle("minecraft:rain")
        object Smoke : Particle("minecraft:smoke")
        object Sneeze : Particle("minecraft:sneeze")
        object Spit : Particle("minecraft:spit")
        object SquidInk : Particle("minecraft:squid_ink")
        object SweepAttack : Particle("minecraft:sweep_attack")
        object TotemOfUndying : Particle("minecraft:totem_of_undying")
        object Underwater : Particle("minecraft:underwater")
        object Splash : Particle("minecraft:splash")
        object Witch : Particle("minecraft:witch")
        object BubblePop : Particle("minecraft:bubble_pop")
        object CurrentDown : Particle("minecraft:current_down")
        object BubbleColumnUp : Particle("minecraft:bubble_column_up")
        object Nautilus : Particle("minecraft:nautilus")
        object Dolphin : Particle("minecraft:dolphin")
        object CampfireCosySmoke : Particle("minecraft:campfire_cosy_smoke")
        object CampfireSignalSmoke : Particle("minecraft:campfire_signal_smoke")
        object DrippingHoney : Particle("minecraft:dripping_honey")
        object FallingHoney : Particle("minecraft:falling_honey")
        object LandingHoney : Particle("minecraft:landing_honey")
        object FallingNectar : Particle("minecraft:falling_nectar")
        object FallingSporeBlossom : Particle("minecraft:falling_spore_blossom")
        object Ash : Particle("minecraft:ash")
        object CrimsonSpore : Particle("minecraft:crimson_spore")
        object WarpedSpore : Particle("minecraft:warped_spore")
        object SporeBlossomAir : Particle("minecraft:spore_blossom_air")
        object DrippingObsidianTear : Particle("minecraft:dripping_obsidian_tear")
        object FallingObsidianTear : Particle("minecraft:falling_obsidian_tear")
        object LandingObsidianTear : Particle("minecraft:landing_obsidian_tear")
        object ReversePortal : Particle("minecraft:reverse_portal")
        object WhiteAsh : Particle("minecraft:white_ash")
        object SmallFlame : Particle("minecraft:small_flame")
        object Snowflake : Particle("minecraft:snowflake")
        object DrippingDripstoneLava : Particle("minecraft:dripping_dripstone_lava")
        object FallingDripstoneLava : Particle("minecraft:falling_dripstone_lava")
        object DrippingDripstoneWater : Particle("minecraft:dripping_dripstone_water")
        object FallingDripstoneWater : Particle("minecraft:falling_dripstone_water")
        object GlowSquidInk : Particle("minecraft:glow_squid_ink")
        object Glow : Particle("minecraft:glow")
        object WaxOn : Particle("minecraft:wax_on")
        object WaxOff : Particle("minecraft:wax_off")
        object ElectricSpark : Particle("minecraft:electric_spark")
        object Scrape : Particle("minecraft:scrape")

    }

    var particle: Particle
    var longDistance: Boolean
    var x: Double
    var y: Double
    var z: Double
    var offsetX: Float
    var offsetY: Float
    var offsetZ: Float
    var particleData: Float
    var particleCount: Int

}