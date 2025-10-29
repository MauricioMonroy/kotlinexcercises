package when_expression

fun main() {
    val input = readln().toInt()
    when (input) {
        1 -> println("No!")
        2 -> println("Yes!")
        3 -> println("No!")
        4 -> println("No!")
        else -> println("Unknown number")
    }
}