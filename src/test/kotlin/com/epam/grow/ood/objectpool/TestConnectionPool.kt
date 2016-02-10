package com.epam.grow.ood.objectpool

import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class TestConnectionPool {

    @Test(expectedExceptions = arrayOf(IllegalStateException::class))
    fun testBusyConnection() {
        val con1 = ConnectionPool.acquireConnection()
        val con2 = ConnectionPool.acquireConnection()
        assert(con1.id != con2.id)
        val con3 = ConnectionPool.acquireConnection()
    }


    @Test
    fun testReleaseConnection() {
        // todo acquire all and release and acquire again one
    }

    @Test
    fun testReusingConnection() {
        // todo acquire all, release, and acquire again. check that we use the same one
    }
}