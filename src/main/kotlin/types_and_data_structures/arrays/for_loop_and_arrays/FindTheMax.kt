package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val size = readln().toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }

    for (i in 0..array.lastIndex) {
        if (array[i] == array.maxOrNull()) {
            println(i)
            break
        }
    }
}