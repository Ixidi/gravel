package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerWindowPropertyPacket : Packet {

    /*sealed interface Property {

        enum class Furnace : Property {
            FIRE_ICON,
            MAXIMUM_FUEL_BURN_TIME,
            PROGRESS_ARROW,
            MAXIMUM_PROGRESS
        }

        enum class EnchantmentTable : Property {
            LEVEL_REQUIRED_TOP,
            LEVEL_REQUIRED_MIDDLE,
            LEVEL_REQUIRED_BOTTOM,
            ENCHANTMENT_SEED,
            MOUSE_HOVER_ID_TOP,
            MOUSE_HOVER_ID_MIDDLE,
            MOUSE_HOVER_ID_BOTTOM,
            MOUSE_HOVER_LEVEL_TOP,
            MOUSE_HOVER_LEVEL_MIDDLE,
            MOUSE_HOVER_LEVEL_BOTTOM
        }

        enum class Beacon : Property {
            POWER_LEVEL,
            FIRST_POTION_EFFECT,
            SECOND_POTION_EFFECT
        }

        enum class Anvil : Property {
            REPAIR_COST
        }

        enum class BrewingStand : Property {
            BREW_TIME,
            FULL_TIME
        }

        enum class StoneCutter : Property {
            SELECTED_RECIPE
        }

        enum class Loom : Property {
            SELECTED_PATTERN
        }

        enum class Lectern : Property
    }*/

    var windowId: UByte
    var property: Short
    var value: Short

}