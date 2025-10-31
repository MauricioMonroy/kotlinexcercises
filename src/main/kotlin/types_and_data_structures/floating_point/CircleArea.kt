package types_and_data_structures.floating_point

import kotlin.math.pow

fun main() {
    val radius = readln().toInt()
    val area = 3.1415 * radius.toDouble().pow(2)
    println(area)
}