package xyz.ixidi.gravel.bot.listener

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import xyz.ixidi.gravel.bot.event.Event
import kotlin.coroutines.CoroutineContext
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

class ListenerManager(
    context: CoroutineContext
) : CoroutineScope {

    private inner class ListenerPack<E : Event> {

        private val listeners = ArrayList<Listener<E>>()

        suspend fun handle(event: E) {
            val remove = ArrayList<Listener<E>>()
            listeners
                .forEach {
                    if (it.oneTimeUse) remove.add(it)
                    it.handler(this@ListenerManager, event)
                }
            listeners.removeIf { it in remove }
        }

        fun add(listener: Listener<E>) {
            listeners.add(listener)
            listeners.sortedByDescending { it.priority }
        }

    }

    override val coroutineContext: CoroutineContext = SupervisorJob() + context
    private val listenerPacks = HashMap<KClass<out Event>, ListenerPack<*>>()

    suspend fun <E : Event> handle(event: E) {
        (listenerPacks[event::class] as? ListenerPack<E>)?.handle(event) ?: return
    }

    fun <E : Event> addListener(
        clazz: KClass<E>,
        priority: Int,
        oneTimeUse: Boolean,
        handler: suspend CoroutineScope.(E) -> Unit
    ) {
        var pack = listenerPacks[clazz]
        if (pack == null) {
            pack = ListenerPack<E>()
            listenerPacks[clazz] = pack
        }

        (pack as ListenerPack<E>).add(Listener(clazz, priority, oneTimeUse, handler))
    }

}