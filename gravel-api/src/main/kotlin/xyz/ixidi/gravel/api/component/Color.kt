package xyz.ixidi.gravel.api.component

import java.awt.Color as AWTColor

interface Color {

    val red: Int
    val green: Int
    val blue: Int

}

fun AWTColor.toGravelColor() = object : Color {
    override val red: Int = getRed()
    override val green: Int = getGreen()
    override val blue: Int = getBlue()
}