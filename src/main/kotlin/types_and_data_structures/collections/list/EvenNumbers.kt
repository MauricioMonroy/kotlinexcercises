package types_and_data_structures.collections.list

fun solution2(numbers: List<Int>) {
    val evenNumbers = numbers.filter { it % 2 == 0 }.joinToString(separator = " ") { it.toString() }
    println(evenNumbers)
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    solution2(input)
}
