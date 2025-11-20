package types_and_data_structures.collections.set.mutable_set

fun mainFilter(newSet: MutableSet<String>, oldSet: Set<String>): MutableSet<String> {
    // Filter elements from oldSet that start with 'A' or 'a' and add them to newSet
    oldSet.filter { it.startsWith("A", ignoreCase = true) }
        .forEach { newSet.add(it) }
    // Return the newSet containing filtered elements
    return newSet
}

fun main() {
    // Create a mutable set to hold filtered elements
    val newSet = mutableSetOf<String>()

    // Create an old set with some elements
    val oldSet = setOf("Apple", "Banana", "Avocado", "Cherry", "apricot")

    // Call the mainFilter function to filter elements from oldSet and add them to newSet
    val resultSet = mainFilter(newSet, oldSet)

    // Print the resulting set
    println(resultSet) // Output: [Apple, Avocado, apricot]
}