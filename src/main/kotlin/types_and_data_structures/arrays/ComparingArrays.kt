package types_and_data_structures.arrays

fun main() {
    val simpleArray = intArrayOf(1, 2, 3)
    val anotherArray = intArrayOf(1, 2, 3)

    println(simpleArray == anotherArray)          // false
    println(simpleArray === anotherArray)         // false
    println(anotherArray == anotherArray)         // true
    println(simpleArray.contentEquals(anotherArray)) // true

    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n = 6
    val elem = arr[arr[n]] // arr[6] is 7, so arr[arr[6]] is arr[7], which is 8
    println(elem) // Prints 8
    println(arr[arr.size - 2]) // Prints 8

    // Different ways to access the last element of the array
    println(arr[arr.lastIndex]) // Prints 9
    println(arr[arr.size - 1]) // Prints 9
    println(arr.last()) // Prints 9
}