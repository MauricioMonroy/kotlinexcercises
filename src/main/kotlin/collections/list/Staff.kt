package collections.list

fun main() {
    val staff = emptyList<String>() // Create an empty list of types_and_data_structures.strings
    println(staff) // Output: []

    // Creating a list calling a builder function
    val names = listOf<String>("Alice", "Bob", "Charlie") // Create a list with initial values

    val list = buildList {
        add("Alice")
        add("Bob")
        add("Charlie")
    } // Create a mutable list using buildList
    println(list) // Output: [Alice, Bob, Charlie]
}