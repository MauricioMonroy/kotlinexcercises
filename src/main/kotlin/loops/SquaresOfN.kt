package loops

fun main() {
    val n = readln().toInt()
    // Print the squares of natural number from 1 to n. Not exceeding n.
    for (i in 1..n) {
        val square = i * i
        if (square > n) break
        println("$square ")
    }
}