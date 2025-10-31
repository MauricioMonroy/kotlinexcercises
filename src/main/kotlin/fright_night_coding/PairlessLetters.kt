package fright_night_coding

/* This program processes six input strings and identifies characters that do not have a matching pair within each string.
 * It counts the occurrences of each character and collects those with odd counts (i.e., without pairs).
 * Finally, it concatenates these characters from all six strings and prints the result.
 * Example:
 * Input:
 * abccba
 * aabbccdde
 * xyzzyx
 * hello
 * testset
 * programming
 * Output:
 * dehlg
 */

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
