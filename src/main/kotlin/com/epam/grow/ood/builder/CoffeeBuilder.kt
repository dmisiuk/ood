package com.epam.grow.ood.builder

/**
 * @author Dzmitry Misiuk
 */
interface CoffeeBuilder {
    fun makeCoffee(): Coffee
    fun addCoffee()
    fun addMilk()
    fun addSugar()
}