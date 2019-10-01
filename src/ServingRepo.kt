import models.Fish
import models.Plate
import models.Ugali
import models.Veggies

/*
Provides an interface for receiving plate instances
 */
object ServingRepo : IGetPlates {

    override fun getUgaliPlate(): Plate<Ugali> = Plate()

    override fun getFishPlate(): Plate<Fish> = Plate()

    override fun getVeggiesPlate(): Plate<Veggies> = Plate()
}

interface IGetPlates {
    fun getUgaliPlate(): Plate<Ugali>
    fun getFishPlate(): Plate<Fish>
    fun getVeggiesPlate(): Plate<Veggies>
}