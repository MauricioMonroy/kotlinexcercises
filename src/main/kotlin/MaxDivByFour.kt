fun main() {
    val n = readln().toInt() // Read number of elements to enter
    val numbers = mutableListOf<Int>()
    repeat(n) {
        numbers.add(readln().toInt()) // Read each number and add it to the list
    }
    // Find the maximum number from the filtered list
    val filteredNumbers = numbers.filter { it % 4 == 0 }

    println(filteredNumbers.maxOrNull()) // Print the maximum number divisible by 4

}
