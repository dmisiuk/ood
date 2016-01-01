package com.epam.grow.ood.factory

import org.testng.Assert.*
import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class ProductFactoryTest {


    @Test
    fun testCreateProduct() {
        val phone = ProductFactory.createProduct("phone")
        assertTrue(phone is Phone)
        val car = ProductFactory.createProduct("car")
        assert(car is Car)
    }
}