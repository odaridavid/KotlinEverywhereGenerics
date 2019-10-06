import helpers.*

/**
 * Class with one generic upper bound constraint
 */
class FoodPlate<T : Food> {
    fun addFoodToPlate(vararg food: T) {}
}

/**
 * Function with one generic upper bound constraint
 */
fun <T : Food> T.warm() {
}

/**
 * Function with multiple generic constraints
 *
 * Type needs to be an instance of all specified constraints
 */
fun <T> T.cool() where T : Food,
                       T : Edible {
}

/**
 * Class with multiple generic constraints
 */
class Medicine<T> where T : Tablet,
                        T : Syrup {
}

fun main() {

    //Takes in any type parameter without constraints
    val plate: Plate<Int> = Plate()
//    val plateOfFood: FoodPlate<Int> = Plate() -> Won't  Compile
    val plateOfFood: FoodPlate<Ugali> = FoodPlate()

}