package fright_night_coding

fun main() {
    val inputs = List(6) { readln() }
    val result = StringBuilder()

    for (line in inputs) {
        val charCount = mutableMapOf<Char, Int>()
        for (char in line) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
        val pairlessChars = charCount.filter { it.value % 2 != 0 }.keys
        result.append(pairlessChars.joinToString(""))
    }
    println(result.toString())
}
