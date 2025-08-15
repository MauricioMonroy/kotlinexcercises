package extension_functions

fun next(prev: Int): Int = prev * 1000 - 10

fun Int.nextValue(): Int = this * 1000 - 10

fun main() {
    val prev = 5
    println(next(prev))  // Output: 4990
    println(prev.nextValue())  // Output: 4990

    // Demonstrating the use of the extension function on an Int
    val number = 10
    println(number.nextValue())  // Output: 9990
}