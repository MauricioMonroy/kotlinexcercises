package types_and_data_structures.collections.set

fun main() {
    // isEmpty and size properties
    val visitors = setOf("Alice", "Bob", "Charlie")
    println("Is the set empty? ${visitors.isEmpty()}") // Output: false
    println("Number of visitors: ${visitors.size}") // Output: 3

    // indexOf and contains methods
    println("Index of 'Bob': ${visitors.indexOf("Bob")}") // Output: 1
    println("Does the set contain 'Charlie'? ${visitors.contains("Charlie")}") // Output: true

    // first and last methods
    println("First visitor: ${visitors.first()}") // Output: Alice
    println("Last visitor: ${visitors.last()}") // Output: Charlie

    // Use joinToString to create a string representation of the set
    val visitorsString = visitors.joinToString(separator = ", ", prefix = "[", postfix = "]")
    println("Visitors: $visitorsString") // Output: Visitors: [Alice, Bob, Charlie]

    // Use containsAll to check if the set contains all elements of another collection
    val newVisitors = setOf("Alice", "Bob")
    println("Does the set contain all new visitors? ${visitors.containsAll(newVisitors)}") // Output: true

    // Use union to combine two sets
    val moreVisitors = setOf("David", "Eve")
    val allVisitors = visitors.union(moreVisitors)
    println("All visitors: ${allVisitors.joinToString(", ")}") // Output: All visitors: Alice, Bob, Charlie, David, Eve

    // Convert a MutableList to a Set
    val mutableList = mutableListOf("Alice", "Bob", "Charlie", "Alice")
    val uniqueVisitorsSet = mutableList.toSet() // Converts to a Set, removing duplicates
    println("Unique visitors from list: ${uniqueVisitorsSet.joinToString(", ")}")
    // Output: Unique visitors from list: Alice, Bob, Charlie

}

