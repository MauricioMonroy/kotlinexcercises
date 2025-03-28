package whileloops

import java.util.*

fun main() {
    print("Enter a text: ")
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
}