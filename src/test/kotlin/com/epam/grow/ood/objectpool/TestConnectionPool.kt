package com.epam.grow.ood.objectpool

import org.testng.Assert.assertEquals
import org.testng.Assert.assertNotNull
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class TestConnectionPool {

    @BeforeMethod
    fun releaseAllConnections() = ConnectionPool.releaseAll()

    @Test(expectedExceptions = arrayOf(IllegalStateException::class))
    fun testBusyConnection() {
        val con1 = ConnectionPool.acquireConnection()
        val con2 = ConnectionPool.acquireConnection()
        assert(con1.id != con2.id)
        ConnectionPool.acquireConnection()
    }


    @Test
    fun testReleaseConnection() {
        val con1 = ConnectionPool.acquireConnection()
        val con2 = ConnectionPool.acquireConnection()
        assertNotNull(con2)
        ConnectionPool.releaseConnection(con1)
        val con1Reused = ConnectionPool.acquireConnection()
        assertNotNull(con1Reused)
    }

    @Test
    fun testReusingConnection() {
        val con1 = ConnectionPool.acquireConnection()
        val con2 = ConnectionPool.acquireConnection()
        assertNotNull(con2)
        ConnectionPool.releaseConnection(con1)
        val con1Reused = ConnectionPool.acquireConnection()
        assertEquals(con1, con1Reused)
    }
}