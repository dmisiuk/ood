package com.epam.grow.ood.builder

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class TestBarWithWaiter {

    @Test
    fun orderLate() {
        Bar.waiter.builder = LateBuilder()
        val coffee = Bar.waiter.coffeePlease();
        assertEquals(1, coffee.coffeeCount)
        assertEquals(2, coffee.milkCount)
    }

    @Test
    fun orderCappuccino() {
        Bar.waiter.builder = CappuccinoBuilder()
        val coffee = Bar.waiter.coffeePlease()
        assertEquals(1, coffee.coffeeCount)
        assertEquals(1, coffee.milkCount)
    }
}