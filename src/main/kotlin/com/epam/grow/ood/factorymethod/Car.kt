package com.epam.grow.ood.factorymethod

/**
 * @author Dzmitry Misiuk
 */
class Car : Transport {
    override fun move(): String {
        val message = "Drive"
        println(message)
        return message
    }
}