package com.epam.grow.ood.builder

/**
 * @author Dzmitry Misiuk
 */
class CappuccinoBuilder : CoffeeBuilder {

    val cappuccino = Cappuccino()
    override fun makeCoffee(): Coffee {
        addMilk()
        addCoffee()
        addSugar()
        return cappuccino;
    }

    override fun addMilk() {
        cappuccino.milkCount = 1
    }

    override fun addCoffee() {
        cappuccino.coffeeCount = 1
    }

    override fun addSugar() {
        cappuccino.sugarCount = 1
    }
}
