package types_and_data_structures.arrays

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.contentToString()) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    val characters = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
    println(characters.contentToString()) // [a, b, c, d, e, f]

    val doubles = doubleArrayOf(1.5, 2.5, 3.5)
    println(doubles.contentToString()) // [1.5, 2.5, 3.5]

    val booleans = booleanArrayOf(true, false, true)
    println(booleans.contentToString()) // [true, false, true]

    val numbersWithPredefineSize = IntArray(7)
    println(numbersWithPredefineSize.contentToString()) // [0, 0, 0, 0, 0, 0, 0]
    // Prints only 1, 4 and 7
    for (i in numbersWithPredefineSize.indices step 3) {
        numbersWithPredefineSize[i] = 1 + i
    }
    println(numbersWithPredefineSize.contentToString()) // [1, 0, 0, 4, 0, 0, 7]

    // Array with predefined size and initialization logic
    // Each element is initialized to the square of its (index + 1)
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.contentToString()) // [1, 4, 9, 16, 25]

    val inputNumbers = IntArray(4) { readln().toInt() }
    println(inputNumbers.contentToString()) // Prints the array of numbers read from input

    // This line reads a line of input, splits it by spaces, converts each part to an integer,
    // and then converts the resulting list to a typed array of integers
    val separatedNumbers = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(separatedNumbers.joinToString()) // Prints the array of numbers read from input, joined by commas
    println(separatedNumbers.size) // Prints the size of the array

    // Example of splitting a string by whitespace (spaces, tabs, etc.) using regex
    // and converting the parts to an array of integers
    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6
}