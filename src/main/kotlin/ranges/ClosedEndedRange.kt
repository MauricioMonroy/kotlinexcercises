package ranges

fun main() {
    // Closed-ended range
    val closedRange = 1..10 // This is a closed-ended range from 1 to 10, inclusive
    println("Closed-ended range: $closedRange")

    // Check if a number is within the closed-ended range
    println("Enter a number to check if it's within the closed-ended range (1 to 10):")
    val number = readln().toInt()
    if (number in closedRange) {
        println("$number is within the closed-ended range.")
    } else {
        println("$number is outside the closed-ended range.")
    }

    // Iterate over the closed-ended range
    for (i in closedRange) {
        println(i)
    }
}