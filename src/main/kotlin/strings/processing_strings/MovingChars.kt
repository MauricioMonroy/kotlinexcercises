package strings.processing_strings

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
