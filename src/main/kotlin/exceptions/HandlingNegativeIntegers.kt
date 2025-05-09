package exceptions

import kotlin.NumberFormatException

fun main() {
    // Read user input as a string
    val input = readLine()

    try {
        // TODO: Convert the input string to an integer
        // TODO: Check if the integer is non-negative
        // TODO: If the integer is non-negative, print its square
        // TODO: If the integer is negative, throw an exception with an error message
        val number = input?.toIntOrNull()?.takeIf { it >= 0 }
            ?: throw NumberFormatException("Invalid input! Please enter a non-negative integer.")
        println(number * number)
    } catch (e: NumberFormatException) {
        // TODO: Handle the exception if the input is not a valid integer
        println(e.message)
    }
}