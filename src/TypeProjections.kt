import helpers.Fish
import helpers.Food
import helpers.Ugali

fun main() {
    //Type Projection with Use Site Variance
    val arrayOfSomething: Array<in Food> = arrayOf(Ugali())
    arrayOfSomething[0] = Ugali()


    val arrayOfSomethingElse: Array<out Food> = arrayOf(Ugali())
//    arrayOfSomethingElse[0] = Food() --> Won't Compile
    arrayOfSomethingElse[0]

    starProjection()
}

fun starProjection() {
    //Safely Read
    val a: A<*> = A<B>() // A<*> == A<out T>
    val typeParameterName = a.getTypeParameter()::class.java.simpleName
    println(typeParameterName)

    //Safely Write
    val c: C<*> = C<Int>()//C<*> == C<in Nothing>
}

//Covariant
class A<out T : B> {
    @Suppress("UNCHECKED_CAST")
    fun getTypeParameter(): T = B() as T
}

//Contravariant
class C<in T> {}

//Invariant = D<out B> for reading values and D<in Nothing> for writing values.
class D<T : B> {}

open class B {}