package com.epam.grow.ood.abstractfactory.university

import com.epam.grow.ood.abstractfactory.EducationFactory
import com.epam.grow.ood.abstractfactory.Instructor
import com.epam.grow.ood.abstractfactory.Learner

/**
 * @author Dzmitry Misiuk
 */
class UniversityFactory : EducationFactory {
    override fun createLearner(): Learner = Student()

    override fun createInstructor(): Instructor = Professor()
}