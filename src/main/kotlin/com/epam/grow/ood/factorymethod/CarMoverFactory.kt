package com.epam.grow.ood.factorymethod

/**
 * @author Dzmitry Misiuk
 */
class CarMoverFactory : MoverFactory() {
    override fun createTransport() = Car()
}