package ranges

fun main() {
    val a = readln().toInt()
    val b = 1
    val c = 10
    val outOfRange = a !in b..c
    println(outOfRange)
}