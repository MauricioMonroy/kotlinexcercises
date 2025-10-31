package types_and_data_structures.strings.processing_strings

fun main() {
    val input = readln().split(" ")
    val text = input[0]
    val n = input[1].toInt()
    if (n > text.length) {
        println(text)
    } else {
        val moved = text.substring(n) + text.take(n)
        println(moved)
    }
}
// This program reads a string and an integer n from the input, then moves the first n characters of the string to the end and prints the result. If n is greater than the length of the string, it simply prints the original string.
// Example:
// Input: "abcdef 2"
// Output: "cdefab"
// Input: "hello 10"
// Output: "hello"