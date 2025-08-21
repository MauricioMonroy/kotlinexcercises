package functions.extension_functions

fun Int.negative() = -this
fun Int.addFive() = this + 5
fun Int.double() = this * 2

fun main() {
    val result = 1.negative().addFive().double()
    println(result) // Output: 8
}