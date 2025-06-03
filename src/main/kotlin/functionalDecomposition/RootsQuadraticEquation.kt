package functionalDecomposition

import kotlin.math.pow

fun calculateDiscriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun calculateRoots(a: Double, b: Double, c: Double, discriminant: Double) {
    val x1 = (-b + discriminant.pow(0.5)) / (2 * a)
    val x2 = (-b - discriminant.pow(0.5)) / (2 * a)
    if (x1 == x2) {
        println("x = $x1")
    } else {
        println("x1 = $x1")
        println("x2 = $x2")
    }
}

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val discriminant = calculateDiscriminant(a, b, c)

    if (discriminant < 0) {
        println("no roots")
    } else if (discriminant == 0.0) {
        calculateRoots(a, b, c, discriminant)
    } else {
        calculateRoots(a, b, c, discriminant)
    }
}