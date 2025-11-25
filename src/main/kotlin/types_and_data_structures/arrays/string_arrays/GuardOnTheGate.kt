package types_and_data_structures.arrays.string_arrays

fun main() {
    var backFromTheWall = readln().split(',').map { it }.toTypedArray()
    val returnedWatchman = readln().toString()
    val updatedArray = backFromTheWall.plus(returnedWatchman)
    println(updatedArray.joinToString())
}

