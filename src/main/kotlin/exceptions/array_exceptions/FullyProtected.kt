package exceptions.array_exceptions

import java.util.*

fun main() {
    val string = readln()
    val index = readln().toInt()
    try {
        println(string[index])
    } catch (e: StringIndexOutOfBoundsException) {
        println("Out of bounds!")
    }
}

