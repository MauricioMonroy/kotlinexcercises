package types_and_data_structures.arrays.multi_dimensional_arrays

import kotlin.collections.indices

fun main() {
    val arrayOfZeros = arrayOf(
        arrayOf(arrayOf(0, 0, 0), arrayOf(0, 0, 0), arrayOf(0, 0, 0)),
        arrayOf(arrayOf(0, 0, 0), arrayOf(0, 0, 0), arrayOf(0, 0, 0)),
        arrayOf(arrayOf(0, 0, 0), arrayOf(0, 0, 0), arrayOf(0, 0, 0))
    )
    println(arrayOfZeros.contentDeepToString())
}