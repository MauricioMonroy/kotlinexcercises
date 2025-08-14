package collections.set.mutable_set

fun evenFilter(numbers: Set<Int>): Set<Int> {
    val conversion = numbers.toMutableSet()
    return conversion.filter { it % 2 == 0 }.toSet()
}

fun main() {
    val inputNumbers = readln().split(" ").map { it.toInt() }.toSet()
    val resultSet = evenFilter(inputNumbers)
    println(resultSet.joinToString(" "))
}