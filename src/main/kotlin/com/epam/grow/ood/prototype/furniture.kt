package com.epam.grow.ood.prototype

/**
 * @author Dzmitry Misiuk
 */
interface IClone<T> {
    fun clone(): T
}

class Chair(val name: String) : IClone<Chair> {

    override fun clone(): Chair {
        return Chair(name)
    }

}

class Room : IClone<Room> {

    val chairs = arrayListOf<Chair>()
    fun addChair(chair: Chair) {
        chairs.add(chair)
    }

    public override fun clone(): Room {
        val room = Room()
        room.chairs.addAll(chairs.map { it.clone() })
        return room
    }

}