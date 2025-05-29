package ranges

fun main() {
    // If you need to exclude the right border, you may subtract 1 from it or use '..<' to get an open-ended range
    println("Enter three integers (a, b, c):")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    // Exclude the right border by subtracting 1
    val withinExclRight = c in a..b - 1 // a <= c && c < b
    val withinExclRight2 = c in a..<b // a <= c && c < b (the recommended way)
    println("Is $c within the range [$a, $b) excluding the right border? $withinExclRight")
    println("Is $c within the range [$a, $b) excluding the right border? $withinExclRight2")

    // Checking if the value is not within the range using '!' operator
    val notWithinExclRight = 100 !in 10..99 // true
    println("Is 100 not within the range [10, 99)? $notWithinExclRight")
}