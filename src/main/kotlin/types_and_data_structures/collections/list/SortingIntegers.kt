package types_and_data_structures.collections.list

fun sortIntegers(integers: List<Int>): List<Int> {
    return integers.sorted()
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val sortedIntegers = sortIntegers(input)
    println(sortedIntegers.joinToString(" "))
}
