package loops

fun main() {
    val range1 = readln().toLong()
    val range2 = readln().toLong()
    var product = 1L // Initialize product to 1 for multiplication
    for (i in range1..range2 - 1) {
        product *= i // Multiply each number in the range
    }
    println(product) // Print the final product
}

