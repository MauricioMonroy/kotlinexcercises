package constructors

import kotlin.random.Random // library for getting random numbers

class Cat(val name: String) {

    /** The current state of the cat (by default a cat isn't sleeping). */
    var sleeping: Boolean = false

    /**
     * A cat says "meow" if it is not sleeping, otherwise, it says "zzz".
     * After a cat says "meow", it can sometimes fall asleep.
     */
    fun say() {
        if (sleeping) {
            println("zzz")
        } else {
            println("meow")

            if (Random.nextDouble() < 0.1) { //generates a double value between 0 and 1.0
                sleeping = true
            }
        }
    }

    /** The function wakes the cat. */
    fun wakeUp() {
        sleeping = false
    }
}

fun main() {
    val meowzart = Cat("Meowzart") // create a new cat named Meowzart

    repeat(7) {
        meowzart.say()  // it says "meow" or "zzz"
    }

    meowzart.wakeUp()  // wake the cat up
    meowzart.say()  // it says "meow"
}