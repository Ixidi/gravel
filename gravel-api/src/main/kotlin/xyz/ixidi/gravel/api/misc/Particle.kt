package xyz.ixidi.gravel.api.io

sealed class Particle(val particleId: Int) {

    object AmbientEntityEffect : Particle(0)
    object AngryVillager : Particle(1)
    object Barrier : Particle(2)
    object Light : Particle(3)
    class Block(val blockState: Int) : Particle(4)
    object Bubble : Particle(5)
    object Cloud : Particle(6)
    object Crit : Particle(7)
    object DamageIndicator : Particle(8)
    object DragonBreath : Particle(9)
    object DrippingLava : Particle(10)
    object FallingLava : Particle(11)
    object LandingLava : Particle(12)
    object DrippingWater : Particle(13)
    object FallingWater : Particle(14)
    class Dust(val red: Float, val green: Float, val blue: Float, val scale: Float) : Particle(15)
    class DustColorTransition(
        val fromRed: Float,
        val fromGreen: Float,
        val fromBlue: Float,
        val scale: Float,
        val toRed: Float,
        val toGreen: Float,
        val toBlue: Float
    ) : Particle(16)

    object Effect : Particle(17)
    object ElderGuardian : Particle(18)
    object EnchantedHit : Particle(19)
    object Enchant : Particle(20)
    object EndRod : Particle(21)
    object EntityEffect : Particle(22)
    object ExplosionEmitter : Particle(23)
    object Explosion : Particle(24)
    class FallingDust(val blockState: Int) : Particle(25)
    object Firework : Particle(26)
    object Fishing : Particle(27)
    object Flame : Particle(28)
    object SoulFireFlame : Particle(29)
    object Soul : Particle(30)
    object Flash : Particle(31)
    object HappyVillager : Particle(32)
    object Composter : Particle(33)
    object Heart : Particle(34)
    object InstantEffect : Particle(35)
    class Item(val item: SlotData) : Particle(36)
    class Vibration(
        val originX: Double,
        val originY: Double,
        val originZ: Double,
        val destX: Double,
        val destY: Double,
        val destZ: Double,
        val ticks: Int
    ) : Particle(37)
    object ItemSlime : Particle(38)
    object ItemSnowball : Particle(39)
    object LargeSmoke : Particle(40)
    object Lava : Particle(41)
    object Mycelium : Particle(42)
    object Note : Particle(43)
    object Poof : Particle(44)
    object Portal : Particle(45)
    object Rain : Particle(46)
    object Smoke : Particle(47)
    object Sneeze : Particle(48)
    object Spit : Particle(49)
    object SquidInk : Particle(50)
    object SweepAttack : Particle(51)
    object TotemOfUndying : Particle(52)
    object Underwater : Particle(53)
    object Splash : Particle(54)
    object Witch : Particle(55)
    object BubblePop : Particle(56)
    object CurrentDown : Particle(57)
    object BubbleColumnUp : Particle(58)
    object Nautilus : Particle(59)
    object Dolphin : Particle(60)
    object CampfireCosySmoke : Particle(61)
    object CampfireSignalSmoke : Particle(62)
    object DrippingHoney : Particle(63)
    object FallingHoney : Particle(64)
    object LandingHoney : Particle(65)
    object FallingNectar : Particle(66)
    object FallingSporeBlossom : Particle(67)
    object Ash : Particle(68)
    object CrimsonSpore : Particle(69)
    object WarpedSpore : Particle(70)
    object SporeBlossomAir : Particle(71)
    object DrippingObsidianTear : Particle(72)
    object FallingObsidianTear : Particle(73)
    object LandingObsidianTear : Particle(74)
    object ReversePortal : Particle(75)
    object WhiteAsh : Particle(76)
    object SmallFlame : Particle(77)
    object Snowflake : Particle(78)
    object DrippingDripstoneLava : Particle(79)
    object FallingDripstoneLava : Particle(80)
    object DrippingDripstoneWater : Particle(81)
    object FallingDripstoneWater : Particle(82)
    object GlowSquidInk : Particle(83)
    object Glow : Particle(84)
    object WaxOn : Particle(85)
    object WaxOff : Particle(86)
    object ElectricSpark : Particle(87)
    object Scrape : Particle(88)

}