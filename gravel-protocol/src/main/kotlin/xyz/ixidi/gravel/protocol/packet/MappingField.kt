package xyz.ixidi.gravel.protocol.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import kotlin.reflect.KProperty

class MappingField<F, T>(
    private val parent: Field<F>,
    private val convertFrom: (T) -> F,
    private val convertTo: (F) -> T
) : Field<T> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): T = convertTo(parent.getValue(thisRef, property))

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        parent.setValue(thisRef, property, convertFrom(value))
    }

    override suspend fun DataReader.readField() {}
    override suspend fun DataWriter.writeField() {}

}

fun <F, T> Field<F>.mapped(convertFrom: (T) -> F, convertTo: (F) -> T): Field<T> = MappingField(this, convertFrom, convertTo)