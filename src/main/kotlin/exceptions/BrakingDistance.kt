package exceptions

import java.lang.ArithmeticException
import kotlin.math.abs

// Calculate the braking distance of a car when given the speed and the deceleration
// The formula for braking distance is S = v2^2 - v1^2 / 2 * a
// where v1 is the initial speed, v2 is the final speed, and a is the deceleration
// if braking distance could not be calculated, return -1
// When the acceleration is 0, thrown an ArithmeticException, and display: The car does not slow down! and return -1
// For numbers that are not valid integers, thrown a NumberFormatException and display: For input string: "[input]" and return -1
fun calculateBrakingDistance(v1: String, a: String): Int {
    try {
        val v1Int = v1.toInt()
        val aInt = a.toInt()
        if (aInt == 0) {
            throw ArithmeticException("The car does not slow down!")
        }
        return abs((v1Int * v1Int) / (2 * aInt))
    } catch (e: ArithmeticException) {
        println(e.message)
        return -1
    } catch (e: NumberFormatException) {
        println("For input string: \"$v1\"")
        return -1
    }
}
fun main() {
    val v1 = readln()
    val a = readln()
    val brakingDistance = calculateBrakingDistance(v1, a)
    if (brakingDistance != -1) {
        println(brakingDistance)
    }
}
