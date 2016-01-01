package com.epam.grow.ood.singleton

import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class MySingletonTest {

    @Test()
    fun testTwiceInvokingSingleton() {
        val first = MySingleton.getMyValueIncremented()
        val second = MySingleton.getMyValueIncremented()
        assertEquals(1, second - first)
    }
}