package types_and_data_structures.collections.list

fun solution(numbers: List<Int>): Int {
    return numbers.sum()
}

fun main() {
    val inputNumbers = readln().split(" ").map { it.toInt() }
    val result = solution(inputNumbers)
    println(result)
}