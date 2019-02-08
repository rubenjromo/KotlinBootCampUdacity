package demo

//import java.util.Scanner

fun main(args: Array<String>){

    var fortune: String
    for (i in 1..20) {
        fortune = getfortunecookie()
        println ("Your fortune is : ${getfortunecookie()}")
        if (fortune.contains("Take it easy"))
        break

    }

}

fun getfortunecookie():String {

    val fortunes = listOf("You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")

    //val reader = Scanner(System.`in`)

    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull()?: 1


    return fortunes[birthday.rem(fortunes.size)]
}