package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val n = readln().toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }
    val x = readln().toInt()
    var isThere = false
    for (i in 0..array.lastIndex) {
        if (array[i] == x) {
            isThere = true
            break
        }
    }
    println("YES".takeIf { isThere } ?: "NO")
}

// This program reads an integer n, followed by n integers to populate an array. It then reads another integer x and checks if x is present in the array.
// If x is found in the array, it prints "YES"; otherwise, it prints "NO".