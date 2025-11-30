package functions.recursion

fun sumRecursive(n: Int): Int {
    return if (n <= 1) n else n + sumRecursive(n - 1)
}

fun main() {
    val n = readln().toInt()
    println(sumRecursive(n))
}