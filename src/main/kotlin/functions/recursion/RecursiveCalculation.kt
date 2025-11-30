package functions.recursion

fun main() {
    val n = readln().toInt()
    println(fe(n))
}

fun fe(n: Int): Int {
    return when (n) {
        0 -> 4
        -1 -> 1
        else -> fe(n - 1) / 2 + 2 * fe(n - 2)
    }
}