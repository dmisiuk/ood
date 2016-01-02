package com.epam.grow.ood.abstractfactory.university

import com.epam.grow.ood.abstractfactory.Instructor

/**
 * @author Dzmitry Misiuk
 */
class Professor : Instructor {
    override fun teach(): String = "Professor"
}