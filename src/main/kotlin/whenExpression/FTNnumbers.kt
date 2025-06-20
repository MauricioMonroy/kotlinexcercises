package whenExpression

fun main() {
    val n = readln().toInt()
    val fib = setOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val tri = setOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val pow = setOf(1, 10, 100, 1000, 10000, 100000)

    when (n) {
        in fib -> println("F")
        in tri -> println("T")
        in pow -> println("P")
        else -> println("N")
    }
}