package types_and_data_structures.strings.processing_strings

fun main() {
    val input = readln().lowercase()
    val counts = mutableMapOf<Char, Int>()

    for (c in input) {
        if (c.isLetter()) {
            counts[c] = counts.getOrDefault(c, 0) + 1
        }
    }

    val result = StringBuilder()
    for (c in input) {
        if (c.isLetter()) {
            result.append(c).append(counts[c])
        }
    }
    println(result)
}
