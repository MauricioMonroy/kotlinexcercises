package collections.set.mutable_set

val groceries = mutableSetOf<String>("milk", "bread", "eggs")
fun main() {
    groceries.add("cheese")
    groceries.add("bread") // This will not add a duplicate
    // The advantage in comparison with mutableList is that it does not allow duplicates
    println(groceries) // Output: [milk, bread, eggs, cheese]

    groceries.remove("eggs")
    println(groceries) // Output: [milk, bread, cheese]

    groceries.clear()
    println(groceries) // Output: []

}