import helpers.Fish
import helpers.Food

/**
 * Produce T values only,also makes type parameter covariant
 */
class OrdersCovariant<out T> {
    fun process(): T? = null
}

/**
 * Consume T values only,also makes type parameter contravariant
 */
class OrdersContravariant<in T> {
    fun process(t: T) {}
}

fun main() {

    //Covariance - work with specified type and subtypes
    val covariantOrder: OrdersCovariant<Food> = OrdersCovariant<Fish>()
//    val covariantOrder: OrdersCovariant<Fish> = OrdersCovariant<Food>() --> Won't compile

    //Contravariance - works with specified type and its super types
    //val contravariantFood:OrdersContravariant<Food> =  OrdersContravariant<Fish>()>  ---> Won't Compile
    val contravariantOrder: OrdersContravariant<Fish> = OrdersContravariant<Food>()
}