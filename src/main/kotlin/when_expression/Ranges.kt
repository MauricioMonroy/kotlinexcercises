package when_expression

fun main() {
    // This program uses a when expression to check if a number is within certain ranges
    val n = readln().toInt()

    when (n) {
        0 -> println("n is zero")
        in 1..10 -> println("n is between 1 and 10 (inclusive)")
        in 25..30 -> println("n is between 25 and 30 (inclusive)")
        else -> println("n is outside a range")
    }
}
// Note: The ranges are inclusive, so both endpoints are included in the check