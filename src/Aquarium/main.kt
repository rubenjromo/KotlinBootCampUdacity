package demo.Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}, Width: ${myAquarium.width}, Height: ${myAquarium.height}")


}