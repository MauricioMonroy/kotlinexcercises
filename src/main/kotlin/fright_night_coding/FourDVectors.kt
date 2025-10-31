package fright_night_coding

import kotlin.math.*

/*
* This program reads multiple lines of input, each containing four integers representing a 4D vector.
* It calculates the total Euclidean distance between each pair of consecutive vectors, rounding up each distance to the nearest integer,
* and then sums these rounded distances. The final sum is printed as output.
* If the input is empty or contains invalid data, the program outputs 0 or "Invalid input" respectively.
*/

fun main() {
    val lines = generateSequence { readlnOrNull()?.takeIf { it.isNotBlank() } }.toList()

    if (lines.isEmpty()) {
        println(0)
        return
    }

    val vectors = try {
        lines.map { line ->
            val parts = line.split(",").map { it.trim() }
            if (parts.size != 4) throw IllegalArgumentException("Each line must have 4 integers")
            parts.map { it.toInt() }
        }
    } catch (e: Exception) {
        println("Invalid input")
        return
    }

    if (vectors.size < 2) {
        println(0)
        return
    }

    val total = vectors
        .zipWithNext { a, b -> ceil(euclideanDistance(a, b)).toLong() }
        .sumOf { it }

    println(total)
}

fun euclideanDistance(a: List<Int>, b: List<Int>): Double {
    require(a.size == b.size) { "Vectors must have the same dimension" }
    val sumSquares = a.zip(b).sumOf { (x, y) ->
        val d = (y - x).toDouble()
        d * d
    }
    return sqrt(sumSquares)
}
