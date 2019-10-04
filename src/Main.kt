import models.*

fun main() {

    ServingRepo.getFishPlate().addFoodToPlate(Fish(), Fish())

    //Takes in any type parameter
    val plate: Plate<Int> = Plate()
//    val plateOfFood: FoodPlate<Int> = Plate() -> Won't  Compile
    val plateOfFood: FoodPlate<Ugali> = FoodPlate()

    //Type inference from constructor
    val saltSeasoning = Seasoning<Salt>(Salt)
    val saltSeasoning2 = Seasoning(Salt)
//    val plateOfFood = FoodPlate() -> Type Cant be inferred
}