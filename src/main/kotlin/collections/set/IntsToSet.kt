package collections.set

fun intsToSet(ints: MutableList<Int>): Set<Int> {
    // Create a mutable set to hold unique integers
    val uniqueInts = mutableSetOf<Int>()

    // Iterate through the list of integers
    for (num in ints) {
        // Add each integer to the set (duplicates will be ignored)
        uniqueInts.add(num)
    }

    // Return the immutable set containing unique integers
    return uniqueInts.toSet()
}

fun main() {
    val mutableInput = readln().split(" ").map { it.toInt() }.toMutableList()
    val resultSet = intsToSet(mutableInput)
    println(resultSet) // Output the set of unique integers
}