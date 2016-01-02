package com.epam.grow.ood.abstractfactory

/**
 * @author Dzmitry Misiuk
 */
interface EducationFactory {

    fun createLearner(): Learner

    fun createInstructor(): Instructor

}