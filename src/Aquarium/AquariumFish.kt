package demo.Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "Gray"
    override fun eat(){
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "Gold"
    override fun eat(){
        println("Munch on algae")
    }
}
interface FishAction{
    fun eat()
}