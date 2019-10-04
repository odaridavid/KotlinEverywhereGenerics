package models

/**
 * Type of spice can be infered from constructor
 */
class Seasoning<T : Spice>(t: T) {

    fun addSeasoning() {}

}

sealed class Spice

object Salt : Spice()

object Pepper : Spice()
