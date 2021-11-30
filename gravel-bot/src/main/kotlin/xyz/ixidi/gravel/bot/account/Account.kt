package xyz.ixidi.gravel.bot.account

sealed class Account(val name: String) {

    class Cracked(name: String) : Account(name)

}
