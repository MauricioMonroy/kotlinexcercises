package types_and_data_structures.arrays.string_arrays

fun main() {
    val firstArray = readln().split(' ').map { it }.toTypedArray()
    val secondArray = readln().split(' ').map { it }.toTypedArray()
    println(firstArray.joinToString() + ", " + secondArray.joinToString())

    println(firstArray) // Testing purpose. Output: [Ljava.lang.String;@6d06d69c
    println(firstArray.contentEquals(secondArray)) // Testing purpose. Output: false
    println(secondArray.joinToString()) // Testing purpose. Output: elements of secondArray separated by ", "
    println(secondArray.printAllElements()) // Testing purpose. Output: elements of secondArray separated by " "
}

private fun Array<String>.printAllElements(): String {
    var result = ""
    for (element in this) {
        result += "$element "
    }
    return result.trim()
}
