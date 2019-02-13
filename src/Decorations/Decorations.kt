package demo.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations(){

    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println(d1 == d2) //false
    println(d3 == d2) //true

    val d4 = d3.copy()
    println(d3)
    println(d4)
    println(d4 == d3) //true

    val d5 = Decorations2 ("crystal", "wood", "diver")
    println(d5)
    println(d5.rocks)

    //Decomposition
    val (rock:String, wood:String, diver:String) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks:String){}

data class Decorations2(val rocks: String, val wood: String, val diver: String){}