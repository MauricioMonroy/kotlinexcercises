package functions.extension_functions

fun Int.lastDigit(): Int = this % 10

fun main() {
    val numbers = readln().toInt()
    // Eliminates the minus sign if the number is negative
    println(numbers.lastDigit().let { if (it < 0) -it else it })
}