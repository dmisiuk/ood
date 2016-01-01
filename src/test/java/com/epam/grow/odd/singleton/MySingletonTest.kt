package com.epam.grow.odd.singleton

import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import singleton.MySingleton

class MySingletonTest {

    @Test()
    fun testTwiceInvokingSingleton() {
        val first = MySingleton.getMyValueIncremented()
        val second = MySingleton.getMyValueIncremented()
        assertEquals(1, second - first)
    }
}