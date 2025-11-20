package types_and_data_structures.collections.list.basic_lists

fun main() {
    println("Enter the first list of elements separated by commas:")
    val beyondTheWall = readln().split(", ").map { it }.toMutableList()
    println("Enter the second list of elements separated by commas:")
    val backToTheWall = readln().split(", ").map { it }.toMutableList()
    // Check if the list contains same elements does not matter the order
    val isSame = beyondTheWall.size == backToTheWall.size && beyondTheWall.all { it in backToTheWall }
    // Print the result
    println(isSame)
}

// The code reads two lists of elements from the user, splits them by commas, and checks if they contain the same elements regardless of order.