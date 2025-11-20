package types_and_data_structures.collections.map

fun main() {
    val map = buildMap<String, String> {
        put("Apple", "Green")
        put("Banana", "Yellow")
        put("Strawberry", "Red")
    }
    println(map) // Output: {Apple=Green, Banana=Yellow, Strawberry=Red}
}