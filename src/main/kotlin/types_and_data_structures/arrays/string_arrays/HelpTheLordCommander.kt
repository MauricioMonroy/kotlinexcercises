package types_and_data_structures.arrays.string_arrays

fun main() {
    val wentBeyondTheWall = readln().split(',').map { it }.toTypedArray()
    val backFromTheWall = readln().split(',').map { it }.toTypedArray()
    println(wentBeyondTheWall.contentEquals(backFromTheWall))
}