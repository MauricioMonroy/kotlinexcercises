package types_and_data_structures.floating_point

import kotlin.math.pow

fun main() {
    val valueOfX = readln().toDouble()
    val result = valueOfX.pow(3) + valueOfX.pow(2) + valueOfX + 1
    println(result)
}