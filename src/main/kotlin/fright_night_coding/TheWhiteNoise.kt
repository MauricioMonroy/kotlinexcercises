package fright_night_coding

/*
* This program reads a sequence of degree movements (integers) from the input,
* calculates the final position on a circle (0 to 359 degrees) after applying all movements,
* and prints the final position.
* The movements can be positive (clockwise) or negative (counter-clockwise).
* The final position is computed using modulo 360 to ensure it stays within the circle's bounds
*/

fun main() {
    val degreeMovements = readln().split(",").map { it.toInt() }
    val finalPosition = degreeMovements.fold(0) { acc, movement ->
        (acc + movement).mod(360)
    }
    println(finalPosition)
}