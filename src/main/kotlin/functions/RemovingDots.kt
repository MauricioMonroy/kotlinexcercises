package functions

fun isNoDot(c: Char): Boolean = c != '.'

fun main() {
    val originalText = readln()
    val textWithoutDots = originalText.filter(::isNoDot)
    println(textWithoutDots)
}