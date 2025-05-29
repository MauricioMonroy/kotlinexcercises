package ranges

fun main() {
    // Open-ended range
    val openEndedRange = 1 until 10 // This is an open-ended range from 1 to 10, exclusive of 10
    println("Open-ended range: $openEndedRange")

    // Check if a number is within the open-ended range
    println("Enter a number to check if it's within the open-ended range (1 to 10):")
    val number = readln().toInt()
    if (number in openEndedRange) {
        println("$number is within the open-ended range.")
    } else {
        println("$number is outside the open-ended range.")
    }

    // Iterate over the open-ended range
    for (i in openEndedRange) {
        println(i)
    }
}