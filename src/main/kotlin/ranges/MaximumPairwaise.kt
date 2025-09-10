package ranges

fun main() {
    println("Enter the number of values followed by the values themselves separated by new lines:")
    val totalNumbers = readln().toInt()
    val numbers = List(totalNumbers) { readln().toInt() }
    val maxPairwise = if (numbers.size == 1) {
        numbers[0]
    } else {
        numbers.indices.flatMap { i ->
            (i + 1 until numbers.size).map { j -> numbers[i] * numbers[j] }
        }.maxOrNull() ?: numbers[0]
    }
    println(maxPairwise)
}
