package demo.Aquarium

import kotlin.math.PI

open class Aquarium (var width: Int = 20, var length: Int = 40, var height: Int = 100){


    open var volume: Int
        get() = width * length * height / 1000
        set(value) {height = (value *1000) / (width * length)}

    open var water = volume *0.9

    constructor (numberOfFish: Int): this(){
        val water:Int = numberOfFish *2000
        val tank: Double = water + water*0.1
        height = ((tank / length * width)).toInt()
    }

}
class TowerTank(): Aquarium() {
    override water = volume *0.8
    override var volume: Int
        get() = (width * length * height / 1000 * PI).toInt()
        set(value) {height = (value *1000) / (width * length)}
}