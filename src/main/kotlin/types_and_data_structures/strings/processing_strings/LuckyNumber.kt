package types_and_data_structures.strings.processing_strings

fun main() {
    val input = readln()
    val half = input.length / 2
    val leftSum = input.take(half).sumOf { it.digitToInt() }
    val rightSum = input.takeLast(half).sumOf { it.digitToInt() }
    println(if (leftSum == rightSum) "YES" else "NO")
}
