package types_and_data_structures.collections.map

fun main() {
    // Building a map with mutableMapOf
    val buildingMap = mutableMapOf<String, Int>()

    // Adding elements to the map
    buildingMap["Room 101"] = 30
    buildingMap["Room 102"] = 25
    buildingMap["Room 103"] = 20

    // Printing the map
    println(buildingMap) // Output: {Room 101=30, Room 102=25, Room 103=20}

    // Accessing an element
    val roomCapacity = buildingMap["Room 101"]
    println("Capacity of Room 101 is: $roomCapacity") // Output: Capacity of Room 101 is: 30

    // Removing an element
    buildingMap.remove("Room 102")
    println(buildingMap) // Output: {Room 101=30, Room 103=20}
}