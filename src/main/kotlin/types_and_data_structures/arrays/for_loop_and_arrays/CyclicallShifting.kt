package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val n = readln().toInt()
    if (n == 0) return
    val arr = List(n) { readln().toInt() }
    val shifted = listOf(arr.last()) + arr.dropLast(1)
    println(shifted.joinToString(" "))
}