package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val n = readln().toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }
    val x = readln().toInt()
    var count = 0
    for (i in 0..array.lastIndex) {
        if (array[i] == x) {
            count++
        }
    }
    println(count)
}