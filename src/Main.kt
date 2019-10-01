import models.Fish
import models.Plate
import models.Ugali

fun main() {
    ServingRepo.getFishPlate().addFoodToPlate(Fish(), Fish())
    val plates: Plate<Int> = Plate()
}