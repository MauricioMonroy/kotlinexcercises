package characters

fun main() {
    val ch = readln().first()
    val isDigit = ch >= '\u0030' && ch <= '\u0039'

    println(isDigit)
}