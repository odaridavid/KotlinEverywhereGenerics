/**
 * Plate class acts as a container for any type
 */
class Plate<T> {
    fun addFoodToPlate(vararg food: T) {}
}

interface IOrderFood<T> {
}

//Won't Compile -> Objects are singletons hence only one instance type parameters mean that there will be more instances
//object Factory<T>{
//
//}