package collections.map.mutable_map

fun main() {
    val groceries = mutableMapOf(
        "Potato" to 10,
        "Coke" to 5,
        "Chips" to 7
    )

    groceries.remove("Potato")
    println(groceries) // output: {Coke=5, Chips=7}

    groceries.clear()
    println(groceries) // output: {}

    // Using the minusAssign operator to remove an element
    groceries += "Coke" to 5 // Add Coke back to the map
    groceries -= "Coke" // Remove Coke using minusAssign
    println(groceries) // output: {}
}