package loops

fun main() {
    val quantityOfNumbers = readln().toInt() // Read the number of items to sum
    val numbers = mutableListOf<Int>()
    for (i in 1..quantityOfNumbers) {
        numbers.add(readln().toInt()) // Read each number and add it to the list
    }
    // Calculate the sum of the numbers
    val sum = numbers.sum() // Use the sum function to calculate the total
    println(sum) // Print the sum of the numbers
}