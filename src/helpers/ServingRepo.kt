package helpers

import Plate

object ServingRepo : IGetPlates {

    override fun getUgaliPlate(): Plate<Ugali> = Plate()

    override fun getFishPlate(): Plate<Fish> = Plate()

    override fun getVeggiesPlate(): Plate<Veggies> = Plate()
}

/*
Provides an interface for receiving plate instances
 */
interface IGetPlates {
    fun getUgaliPlate(): Plate<Ugali>
    fun getFishPlate(): Plate<Fish>
    fun getVeggiesPlate(): Plate<Veggies>
}

fun main() {
//   ServingRepo.getUgaliPlate().addFoodToPlate(Fish()) -> Won't Compile due to type mismatch
    ServingRepo.getFishPlate().addFoodToPlate(Fish(), Fish())
}