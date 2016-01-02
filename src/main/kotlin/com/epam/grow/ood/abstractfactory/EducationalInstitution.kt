package com.epam.grow.ood.abstractfactory

/**
 * @author Dzmitry Misiuk
 */
class EducationalInstitution(val educationFactory: EducationFactory, val learnersSize: Int = 1) {

    val learners: List<Learner> = (0..learnersSize).map { educationFactory.createLearner() }

    val instructor = educationFactory.createInstructor();

    fun startLesson(): List<String> {
        var out = arrayListOf<String>()
        out.add(instructor.teach())
        learners.forEach { out.add(it.learn()) }
        return out
    }
}