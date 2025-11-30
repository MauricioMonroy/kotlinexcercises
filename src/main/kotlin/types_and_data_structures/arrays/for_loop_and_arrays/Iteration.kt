package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val indices = array.indices

    // Iterating through the array using a for loop
    for (element in array) {
//        println(element)
    }

    for (index in indices) {
//        println(index)
    }

    for (index in array.indices) {
//        println(array[index])
    }

    for (index in array.lastIndex downTo 0 step 6) {
//        println(array[index])
    }

    for (index in 0..array.lastIndex step 1) {
        println(array[index])
    }
}