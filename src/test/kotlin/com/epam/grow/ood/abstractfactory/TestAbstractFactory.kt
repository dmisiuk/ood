package com.epam.grow.ood.abstractfactory

import com.epam.grow.ood.abstractfactory.school.SchoolFactory
import com.epam.grow.ood.abstractfactory.university.UniversityFactory
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


/**
 * @author Dzmitry Misiuk
 */
class TestAbstractFactory {

    @Test
    fun itShouldBeLessonWith10Students() {
        val university = EducationalInstitution(UniversityFactory(), 10)
        val result = university.startLesson();
        assertEquals("Professor", result[0])
        (1..10).forEach { assertEquals("Student", result[it]) }
    }

    @Test
    fun itShouldBeClassWith5Schoolchilds() {
        val school = EducationalInstitution(SchoolFactory(), 5)
        val result = school.startLesson();
        assertEquals("Teacher", result[0])
        (1..5).forEach { assertEquals("Schoolchild", result[it]) }
    }
}