/**
 * Declaration Site Variance
 */
class Foo<in T> {

}

class Bar<out T> {

}

/**
 * Use Site Variance
 */
fun useSiteVarianceDemo() {

    val arrayOfSomething: Array<in Plate<Any>> = arrayOf()

    val arrayOfSomethingElse: Array<out Plate<Any>> = arrayOf()
}