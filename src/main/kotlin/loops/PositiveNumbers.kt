package loops

fun main() {
    val n = readln().toInt() // Read number of elements to enter
    val numbers = mutableListOf<Int>() // List for storing numbers

    repeat(n) {
        numbers.add(readln().toInt()) // Read each number and add it to the list
    }

    val countPositives = numbers.count { it > 0 } // Count the number of positive numbers
    println(countPositives) // Print the count
}