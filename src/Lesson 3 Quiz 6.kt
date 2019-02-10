package demo

fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }

    //val startswithc = spices.filter{{it.startsWith('c') && it.endsWith('e') }}

    val items3withc = spices.take(3).filter{it.startsWith('c')}
}