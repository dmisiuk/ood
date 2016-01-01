package com.epam.grow.ood.factory

/**
 * @author Dzmitry Misiuk
 */
object ProductFactory {

    fun createProduct(name: String): Product {
        return when (name) {
            "phone" -> Phone()
            "car" -> Car()
            else -> throw IllegalArgumentException()
        }
    }
}
