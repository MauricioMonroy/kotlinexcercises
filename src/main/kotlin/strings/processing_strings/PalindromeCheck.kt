package strings.processing_strings

fun main() {
    val input = readln().replace(" ", "").lowercase()
    println(if (input == input.reversed()) "yes" else "no")
}