package collections.map

fun main() {
    // Empty map
    val emptyMap = emptyMap<String, Int>()
    println(emptyMap) // Output: {}

    // Empty mutable map
    val emptyMutableMap = mutableMapOf<String, Int>()
    println(emptyMutableMap) // Output: {}

    // Adding elements to the mutable map
    emptyMutableMap["Alice"] = 8
    emptyMutableMap["Bob"] = 6
    println(emptyMutableMap) // Output: {Alice=8, Bob=6}
}