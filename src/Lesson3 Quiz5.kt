package demo

fun main(args: Array<String>){

    println(whatShouldIDoToday("happy"))

}

    fun whatShouldIDoToday(mood:String, weather:String = "Sunny", temperature:Int = 24): String{
        return when {
            mood == "happy" && weather == "Cloudy" -> "Go for a walk"
            else -> "Stay at home"
        }
    }
