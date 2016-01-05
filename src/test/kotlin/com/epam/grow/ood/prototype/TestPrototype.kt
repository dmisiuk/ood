package com.epam.grow.ood.prototype

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/**
 * @author Dzmitry Misiuk
 */
class TestPrototype {

    @Test
    fun testCloning() {
        val room = Room();
        room.addChair(Chair("ikea"))
        room.addChair(Chair("mdd"))

        val clonedRoom = room.clone()
        assertEquals("ikea", room.chairs[0].name)
        assertEquals("mdd", room.chairs[1].name)

        room.addChair(Chair("md"))
        assertEquals(3, room.chairs.size)
        assertEquals(2, clonedRoom.chairs.size)
    }
}
