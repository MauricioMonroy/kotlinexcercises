package when_expression

import kotlin.math.sqrt

fun triangle(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}

fun rectangle(a: Double, b: Double): Double = a * b
fun circle(radius: Double): Double = 3.14 * radius * radius

fun main() {
    val shape = readln()
    val area = when (shape) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            triangle(a, b, c)
        }

        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            rectangle(a, b)
        }

        "circle" -> {
            val r = readln().toDouble()
            circle(r)
        }

        else -> throw IllegalArgumentException("Unknown shape: $shape")
    }
    println(area)
}
