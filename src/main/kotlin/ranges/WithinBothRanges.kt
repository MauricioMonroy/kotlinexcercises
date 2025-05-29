package ranges

fun main() {
    println("Enter first range start:")
    val firstRangeStart = readln().toInt()
    println("Enter first range end:")
    val firstRangeEnd = readln().toInt()
    println("Enter second range start:")
    val secondRangeStart = readln().toInt()
    println("Enter second range end:")
    val secondRangeEnd = readln().toInt()
    println("Enter the number to check:")
    val numberToCheck = readln().toInt()
    // Evaluate if the number is within both ranges
    val isWithinBothRanges = numberToCheck in firstRangeStart..firstRangeEnd && numberToCheck in secondRangeStart..secondRangeEnd
    println(isWithinBothRanges)
}