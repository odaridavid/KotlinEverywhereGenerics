fun main() {
//    ServingRepo.getUgaliPlate().addFoodToPlate(Fish())
    ServingRepo.getFishPlate().addFoodToPlate(Fish(), Fish())

    //Takes in any type parameter
    val plate: Plate<Int> = Plate()
//    val plateOfFood: FoodPlate<Int> = Plate() -> Won't  Compile
    val plateOfFood: FoodPlate<Ugali> = FoodPlate()

    //Type inference from constructor omit type arguments
    val saltSeasoning = Seasoning<Salt>(Salt)
    val saltSeasoning2 = Seasoning(Salt)
//    val plateOfFood = FoodPlate() -> Type Cant be inferred

    val ugaliList = mutableListOf<Ugali>()

    val foodList: List<Food> = ugaliList.apply {
        add(Ugali())
    }

    println(foodList[0])
}
