package xyz.ixidi.gravel.core.connection

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterOutputStream
import kotlin.coroutines.CoroutineContext

object Compressor {

    suspend fun compress(array: ByteArray, coroutineContext: CoroutineContext = Dispatchers.Unconfined): ByteArray =
        withContext(coroutineContext) {
            val out = ByteArrayOutputStream()
            val deflaterOutputStream = DeflaterOutputStream(out)
            deflaterOutputStream.write(array, 0, array.size)
            deflaterOutputStream.close()
            out.toByteArray()
        }

    suspend fun decompress(
        compressed: ByteArray,
        coroutineContext: CoroutineContext = Dispatchers.Unconfined
    ): ByteArray = withContext(coroutineContext) {
        val out = ByteArrayOutputStream()
        val inflaterOutputStream = InflaterOutputStream(out)
        inflaterOutputStream.write(compressed, 0, compressed.size)
        inflaterOutputStream.close()
        out.toByteArray()
    }

}

suspend fun ByteArray.compress(coroutineContext: CoroutineContext = Dispatchers.Unconfined) =
    Compressor.compress(this, coroutineContext)

suspend fun ByteArray.decompress(coroutineContext: CoroutineContext = Dispatchers.Unconfined) =
    Compressor.decompress(this, coroutineContext)
