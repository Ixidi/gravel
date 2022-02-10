package xyz.ixidi.gravel.protocol.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import kotlin.reflect.KProperty

class OptionalField<F>(
    private val read: suspend DataReader.() -> F?,
    private val write: suspend DataWriter.(F?) -> Unit
) : Field<F?> {

    private var value: F? = null

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): F? = value

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: F?) {
        this.value = value
    }

    override suspend fun DataReader.readField() {
        value = read()
    }

    override suspend fun DataWriter.writeField() {
        write(value)
    }

}