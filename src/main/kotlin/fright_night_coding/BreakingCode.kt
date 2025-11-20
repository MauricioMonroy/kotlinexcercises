package fright_night_coding

import kotlin.text.iterator

// The code to the gates is four digits.
// It is the first, the second, the third and the fourth most common digit in today's sequence, in that particular order.
// If there are equal number of appearances, higher digit should come first.
fun main() {
    val input = readln()
    val digitCount = IntArray(10)

    for (char in input) {
        if (char.isDigit()) {
            digitCount[char - '0']++
        }
    }

    val digitFrequency = digitCount.withIndex().toList()
        .sortedWith(compareByDescending<IndexedValue<Int>> { it.value }.thenByDescending { it.index })

    val code = digitFrequency.take(4).map { it.index }.joinToString("")

    println(code)
}

