package models

/**
 * Plate class acts as a container that holds Food type classes
 */
class FoodPlate<T : Food> {

    fun addFoodToPlate(vararg food: T) {}

}