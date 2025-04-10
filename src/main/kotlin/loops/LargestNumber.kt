package loops

fun main() {
    // This program finds the largest number in an undefined number of inputs
    println("Enter numbers :")
    var largestNumber = Int.MIN_VALUE // Initialize largestNumber to the smallest possible integer
    var maxPosition = 0
    var currentPosition = 1
    try {
        while (true) { // Infinite loop to read numbers until an empty input is given
            val number = readln().toInt() // Read input from the user and convert it to Int
            if (number > largestNumber) { // Check if the current number is larger than the largestNumber
                largestNumber = number // Update largestNumber
                maxPosition = currentPosition // Update maxPosition
            }
            currentPosition++ // Increment currentPosition for the next input
        }
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid number.")
    }
    catch (e: Exception) {
        // Catch any other exceptions (like EOF)
    }
    println("$largestNumber $maxPosition") // Print the largest number and its position

}