package com.epam.grow.ood.abstractfactory.university

import com.epam.grow.ood.abstractfactory.Learner

/**
 * @author Dzmitry Misiuk
 */
class Student : Learner {
    override fun learn(): String = "Student"
}