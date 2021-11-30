package xyz.ixidi.gravel.protocol.packet

import xyz.ixidi.gravel.api.io.DataReader
import xyz.ixidi.gravel.api.io.DataWriter
import kotlin.reflect.KProperty

interface Field<F>  {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): F
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: F)

    suspend fun DataReader.readField()
    suspend fun DataWriter.writeField()

}