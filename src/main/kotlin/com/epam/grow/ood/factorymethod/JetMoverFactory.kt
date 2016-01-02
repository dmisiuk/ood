package com.epam.grow.ood.factorymethod

/**
 * @author Dzmitry Misiuk
 */
class JetMoverFactory : MoverFactory() {
    override fun createTransport(): Transport = Jet()
}