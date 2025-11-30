package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val n = readln().toInt()
    val array = IntArray(n) { readln().toInt() }
    var count = 0
    for (i in 0 until n - 2) {
        if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
            count++
        }
    }
    println(count)
}

// This program reads an integer n and then reads n integers into an array.
// It then counts how many times a sequence of three consecutive integers
// appears in the array, where each integer is exactly one greater than the previous one.
// Finally, it prints the count of such sequences.