package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.launch
import xyz.ixidi.gravel.api.packet.Packet

abstract class Service {

    private var job: Job? = null

    val isRunning = job?.isActive ?: false

    fun start(scope: CoroutineScope) {
        if (isRunning) throw Exception("Service is already running.")

        job = scope.launch { start() }
    }

    fun stop() {
        job?.cancel()
    }

    protected abstract suspend fun start()

}