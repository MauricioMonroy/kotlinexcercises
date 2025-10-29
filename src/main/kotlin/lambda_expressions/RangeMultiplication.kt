package lambda_expressions

fun main() {
    val lambda: (Long, Long) -> Long = { a, b ->
        var result = 1L
        for (i in a..b) {
            result *= i
        }
        result
    }
    val a = readln().toLong()
    val b = readln().toLong()
    val result = lambda(a, b)
    println(result)
}