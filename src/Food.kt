/*
Food types available inheriting from a food superclass
 */
open class Food

class Fish : Food() {
    override fun toString(): String = "Fish"
}

class Ugali : Food(){
    override fun toString(): String = "Ugali"
}

class Veggies : Food(){
    override fun toString(): String = "Veggies"
}

