package com.epam.grow.ood.factorymethod

/**
 * @author Dzmitry Misiuk
 */
class Jet : Transport {
    override fun move(): String {
        val message = "Fly"
        println(message)
        return message
    }
}