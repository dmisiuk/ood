package com.epam.grow.ood.abstractfactory.school

import com.epam.grow.ood.abstractfactory.Instructor

/**
 * @author Dzmitry Misiuk
 */
class Teacher : Instructor {
    override fun teach(): String = "Teacher"
}