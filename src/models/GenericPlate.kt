package models

/*
A Generic models.Plate class acts as a container that holds some food which can be any type
of food from things like rice to soup to meat to burgers..etc.
 */
class Plate<T> {
    fun addFoodToPlate(vararg food: T) {}
}