package com.epam.grow.ood.factorymethod

/**
 * @author Dzmitry Misiuk
 */
abstract class MoverFactory {

    abstract protected fun createTransport(): Transport

    fun moveTransport(): String {
        return createTransport().move()
    }
}