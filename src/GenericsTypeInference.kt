import helpers.Pepper
import helpers.Salt
import helpers.Spice

/**
 * Type of spice can be inferred from constructor
 */
class Seasoning<T : Spice>(private val t: T) {
    fun addSeasoning() {
        when (t) {
            is Salt -> {
                println("Adding Salt")
            }
            is Pepper -> {
                println("Adding Pepper")
            }
        }
    }
}

fun main() {

    val saltSeasoning = Seasoning<Salt>(Salt)
    //Type inference from constructor omit type arguments
    val saltSeasoningInferred = Seasoning(Salt)

    saltSeasoningInferred.addSeasoning()
}
