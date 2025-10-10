package strings.processing_strings

fun main() {
    val words = readln().split(" ")
    println(words.maxByOrNull { it.length })
}