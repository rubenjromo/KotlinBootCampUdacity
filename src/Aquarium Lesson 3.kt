package demo
import java.util.Random

fun main (args: Array<String>){
    println("Hello!")
    feedthefish()
}
fun feedthefish () {
    val day = RandomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eats $food")
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