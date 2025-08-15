package extension_functions

import kotlin.random.Random

class Cat(var sleeping: Boolean)

fun Cat.wakeUp() {
    this.sleeping = false
}
fun Cat.sleep() {
    this.sleeping = true
}

fun randomCat(): Cat {
    val isSleeping = Random.nextBoolean()
    return Cat(isSleeping)
}

fun main() {
    val cat = randomCat()
    println("Is the cat sleeping? ${cat.sleeping}")
}
