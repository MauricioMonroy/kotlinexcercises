package exceptions

import java.lang.ArithmeticException
import kotlin.math.abs

// Calculate the braking distance of a car when given the speed and the deceleration
// The formula for braking distance is S = v2^2 - v1^2 / 2 * a
// where v1 is the initial speed, v2 is the final speed, and 'a' is the deceleration
// if braking distance could not be calculated, return -1
// When the acceleration is 0, thrown an ArithmeticException, and display: The car does not slow down! and return -1
// For numbers that are not valid integers, thrown a NumberFormatException and display: For input string: "[input]" and return -1

fun calculateBrakingDistance(v1: String, a: String): Int {
    val v1Int: Int
    val aInt: Int

    try {
        v1Int = v1.toInt()
    } catch (e: NumberFormatException) {
        println("For input string: \"$v1\"")
        return -1
    }

    try {
        aInt = a.toInt()
    } catch (e: NumberFormatException) {
        println("For input string: \"$a\"")
        return -1
    }

    return try {
        if (aInt == 0) {
            throw ArithmeticException("The car does not slow down!")
        }
        (v1Int * v1Int) / (2 * abs(aInt))
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        -1
    }
}

fun main() {
    println("Enter the initial speed (v1) and deceleration (a):")
    val input = readln().split(" ")
    if (input.size != 2) {
        println("Invalid input. Please enter two values separated by a space.")
        return
    }

    val v1 = input[0]
    val a = input[1]

    val distance = calculateBrakingDistance(v1, a)
    if (distance != -1) {
        println("The braking distance is: $distance")
    }
}
