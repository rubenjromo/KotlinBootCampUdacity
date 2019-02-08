package demo
import java.util.ArrayList
import java.util.Random

fun main (args: Array<String>){
    println("Hello!")
    feedthefish()
    var bubbles = 0
    while (bubbles<50){
        bubbles++
    }
    repeat(2 ){ it:Int
    println("A fish is swimming")
    }
}
fun getDirtySensorReading() = 20

fun shouldChangeWater(day:String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {

    val isTooHot = temperature>30
    val isDirty = dirty>30
    val isSunny = day=="Sunny"
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty)-> true
        isSunny(day) ->true
        else -> false
    }
}

fun isTooHot(temperature:Int) = temperature>30
fun isDirty(dirty:Int) = dirty>30
fun isSunny(day:String) = day == "Sunny"

fun feedthefish () {
    val day = RandomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eats $food")
    shouldChangeWater(day, 25,22)
    if (shouldChangeWater(day)) {
        println("Change the water today!")
    }
}

fun RandomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
fun fishFood(day: String): String {
    var food = "fasting"

    return when (day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}