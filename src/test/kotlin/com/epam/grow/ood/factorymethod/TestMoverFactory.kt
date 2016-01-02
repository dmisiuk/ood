package com.epam.grow.ood.factorymethod

import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class TestMoverFactory {

    @Test
    fun testJetFactory() {
        val factory = JetMoverFactory()
        val result = factory.moveTransport()
        assertEquals("Fly", result)
    }

    @Test
    fun testCarFactory() {
        val factory = CarMoverFactory()
        val result = factory.moveTransport()
        assertEquals("Drive", result)
    }
}