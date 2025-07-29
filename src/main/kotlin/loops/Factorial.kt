package loops

fun main() {
    val n = readln().toInt()
    var result = 1 // Initialize result to 1 for factorial calculation

    for (i in 2..n) {
        result *= i
    }
    println(result)
}