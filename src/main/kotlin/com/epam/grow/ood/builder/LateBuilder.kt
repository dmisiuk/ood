package com.epam.grow.ood.builder

/**
 * @author Dzmitry Misiuk
 */
class LateBuilder : CoffeeBuilder {

    val late = Late()
    override fun makeCoffee(): Coffee {
        addCoffee()
        addMilk()
        addSugar()
        return late
    }

    override fun addCoffee() {
        late.coffeeCount = 1
    }

    override fun addMilk() {
        late.milkCount = 2
    }

    override fun addSugar() {
        late.sugarCount = 1
    }
}