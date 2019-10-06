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

    val arrayOfSomething: Array<in Any>
    val arrayOfSomethingElse: Array<out Any>
}