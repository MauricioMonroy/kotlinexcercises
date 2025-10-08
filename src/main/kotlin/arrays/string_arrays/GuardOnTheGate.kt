package arrays.string_arrays

fun main() {
    var backFromTheWall = readln().split(',').map { it.trim() }.toTypedArray()
    val returnedWatchman = readln().trim()
    val updatedArray = backFromTheWall.plus(returnedWatchman)
    println(updatedArray.joinToString(", "))
}

