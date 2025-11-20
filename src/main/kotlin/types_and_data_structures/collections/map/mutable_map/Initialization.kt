package types_and_data_structures.collections.map.mutable_map

fun main() {
    // Initialize a mutable map with some key-value pairs
    // The keys are names of students and the values are their ages
    val students = mutableMapOf<String, Int>("Nika" to 20, "Luka" to 22, "Ana" to 21)
    println(students) // Print initial map

    // Type can also be derived from the context:
    val carsPerYear = mutableMapOf(2020 to 150, 2021 to 200, 2022 to 180)
    println(carsPerYear) // Print cars per year map

    // Map can also transform into MutableMap with the function toMutableMap()
    val initialMap = mapOf("Alice" to 30, "Bob" to 25)
    val mutableMap = initialMap.toMutableMap()
    mutableMap["Charlie"] = 35 // Add a new entry
    println(mutableMap) // Print updated mutable map
}