package xyz.ixidi.gravel.core.connection

import java.net.InetSocketAddress
import java.util.Hashtable
import javax.naming.directory.InitialDirContext

object AddressResolver {

    private val dirContext = run {
        Class.forName("com.sun.jndi.dns.DnsContextFactory")
        val hashtable: Hashtable<String, String> = Hashtable()
        hashtable["java.naming.factory.initial"] = "com.sun.jndi.dns.DnsContextFactory"
        hashtable["java.naming.provider.url"] = "dns:"
        hashtable["com.sun.jndi.dns.timeout.retries"] = "1"
        InitialDirContext(hashtable)
    }

    fun resolve(host: String, port: Int): InetSocketAddress {
        val redirected = resolveRedirected(host, port)

        return try {
            InetSocketAddress(redirected?.first ?: host, redirected?.second ?: port)
        } catch (ex: Exception) {
            throw ex
        }
    }

    private fun resolveRedirected(host: String, port: Int): Pair<String, Int>? {
        if (port != 25565) return null

        return try {
            val attributes = dirContext.getAttributes("_minecraft._tcp.$host", arrayOf("srv"))
            val attribute = attributes.get("srv") ?: return null

            val split = attribute.get().toString().split(" ")

            split[3] to split[2].toInt()
        } catch (ex: Exception) {
            null
        }
    }

}