package helpers/*
helpers.Food types available inheriting from a food superclass
 */
open class Food

class Fish : Food(), Edible {
    override fun toString(): String = "helpers.Fish"
}

class Ugali : Food(), Edible {
    override fun toString(): String = "helpers.Ugali"
}

class Veggies : Food(), Edible {
    override fun toString(): String = "helpers.Veggies"
}

interface Edible
