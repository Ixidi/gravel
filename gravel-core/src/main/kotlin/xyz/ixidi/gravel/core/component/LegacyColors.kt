package xyz.ixidi.gravel.core.component

import xyz.ixidi.gravel.api.component.Color

enum class LegacyColors(
    override val red: Int,
    override val green: Int,
    override val blue: Int,
    val colorCode: Char,
    val colorName: String
) : Color {

    BLACK(0, 0, 0, '0', "black"),
    DARK_BLUE(0, 0, 170, '1', "dark_blue"),
    DARK_GREEN(0, 170, 0, '2', "dark_green"),
    DARK_CYAN(0, 170, 170, '3', "dark_cyan"),
    DARK_RED(170, 0, 0, '4', "dark_red"),
    DARK_PURPLE(170, 0, 170, '5', "dark_purple"),
    GOLD(255, 170, 0, '6', "gold"),
    GRAY(170, 170, 170, '7', "gray"),
    DARK_GRAY(85, 85, 85, '8', "dark_gray"),
    BLUE(85, 85, 255, '9', "blue"),
    BRIGHT_GREEN(85, 255, 85, 'a', "bright_green"),
    CYAN(85, 255, 255, 'b', "cyan"),
    RED(255, 85, 85, 'c', "red"),
    PINK(255, 85, 255, 'd', "pink"),
    YELLOW(255, 255, 85, 'e', "yellow"),
    WHITE(255, 255, 255, 'f', "white");

}