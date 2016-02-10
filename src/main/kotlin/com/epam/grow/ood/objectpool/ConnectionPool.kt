package com.epam.grow.ood.objectpool

/**
 * @author Dzmitry Misiuk
 */
object ConnectionPool {

    val availableConnections = arrayListOf(Connection(1), Connection(2))
    val busyConnections = arrayListOf<Connection>()

    fun acquireConnection(): Connection {
        if (availableConnections.isNotEmpty()) {
            val connection = availableConnections.removeAt(0)
            busyConnections.add(connection)
            return connection
        } else {
            throw IllegalStateException("not available connection")
        }
    }

    fun releaseConnection(connection: Connection) {
        val isRemoved = busyConnections.remove(connection)
        if (isRemoved) {
            availableConnections.add(connection)
        } else {
            throw IllegalStateException("this connection is not using with this pool")
        }
    }
}