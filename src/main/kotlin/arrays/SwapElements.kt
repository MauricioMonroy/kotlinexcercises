package arrays

fun main() {
    val guarismos = readln().split(" ").map { it.toInt() }.toIntArray()
    // Swap the first and last elements
    val temp = guarismos[0]
    guarismos[0] = guarismos[guarismos.lastIndex]
    guarismos[guarismos.lastIndex] = temp
    // Print the modified array
    println(guarismos.joinToString(" "))
}