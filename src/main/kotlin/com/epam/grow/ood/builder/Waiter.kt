package com.epam.grow.ood.builder

/**
 * @author Dzmitry Misiuk
 */
object Waiter {

    var builder: CoffeeBuilder = CappuccinoBuilder()

    fun coffeePlease(): Coffee {
        return builder.makeCoffee()
    }
}
