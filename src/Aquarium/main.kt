package demo.Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}, Width: ${myAquarium.width}, Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20,15,30)
    println("SmallAquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(9)
    println("Aquarium2 ${myAquarium2.volume} liters with length ${myAquarium2.length} Height ${myAquarium2.height} Width ${myAquarium2.width}")


}