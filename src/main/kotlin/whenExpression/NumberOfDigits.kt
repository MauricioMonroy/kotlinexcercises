package whenExpression

fun main() {
    val input = readln().toInt()
    when (input) {
        in 0..9 -> println("1")
        in 10..99 -> println("2")
        in 100..999 -> println("3")
        in 1000..9999 -> println("4")
        else -> println("More than four digits")
    }
}