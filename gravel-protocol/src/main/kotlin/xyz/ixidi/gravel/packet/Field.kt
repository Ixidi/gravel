package xyz.ixidi.gravel.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import kotlin.reflect.KProperty

class Field<T> internal constructor(
    private val read: suspend DataReader.() -> T,
    private val write: suspend DataWriter.(T) -> Unit
) {

    object ValueNotReadException : Exception("Value has not been read yet.")

    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = value ?: throw ValueNotReadException

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = value
    }

    internal suspend fun DataReader.readField() {
        value = read()
    }

    internal suspend fun DataWriter.writeField() {
        write(value ?: throw ValueNotReadException)
    }

}