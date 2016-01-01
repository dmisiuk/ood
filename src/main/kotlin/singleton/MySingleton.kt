package singleton

/**
 * @author Dzmitry Misiuk
 */
object MySingleton {

    var someValue = 1

    fun getMyValueIncremented() = someValue++
}