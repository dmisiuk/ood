package com.epam.grow.ood.abstractfactory.school

import com.epam.grow.ood.abstractfactory.EducationFactory
import com.epam.grow.ood.abstractfactory.Instructor
import com.epam.grow.ood.abstractfactory.Learner

/**
 * @author Dzmitry Misiuk
 */
class SchoolFactory : EducationFactory {
    override fun createLearner(): Learner = Schoolchild()

    override fun createInstructor(): Instructor = Teacher()
}