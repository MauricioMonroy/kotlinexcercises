package collections.map.mutable_map

fun main() {
    val staff = mutableMapOf(
        "Alice" to 300,
        "Bob" to 250,
        "Charlie" to 350
    )

    println(staff) // Print initial map

    staff["Alice"] = 400 // Update Alice's salary
    staff["David"] = 300 // Add a new employee David

    println(staff) // Print updated map
}