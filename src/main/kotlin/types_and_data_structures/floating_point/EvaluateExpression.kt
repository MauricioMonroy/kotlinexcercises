package types_and_data_structures.floating_point

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()

    val result = a * 10.5 + b * 4.4 + (c + d) / 2.2
    println(result)
}