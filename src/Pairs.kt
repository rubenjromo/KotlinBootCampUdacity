package demo

fun main(args: Array<String>){
    val equipment = "fishnet" to "catching fish"
    println(equipment.first) //fishnet
    println(equipment.second) //catching fish

    val equipment2 = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment2) //(((fishnet, catching fish), of big size), and strong)
    println(equipment2.first) //((fishnet, catching fish), of big size)
    println(equipment2.first.first)//(fishnet, catching fish)
    println(equipment2.first.first.first) //fishnet
    println(equipment2.first.first.second) //catching fish
    println(equipment2.second) //and strong


    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")

    val fishnet = "fishnet" to "catching fish"

    val (tool, use) = fishnet

    println("The tool is $tool to $use") //The tool is fishnet to catching fish

    val fishnetString = fishnet.toString() //(fishnet, catching fish)
    println(fishnetString)

    val fishnetList = fishnet.toList() //[fishnet, catching fish]
    println(fishnetList)

}