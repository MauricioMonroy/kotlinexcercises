package collections.set.mutable_set

val placesOfWorld = mutableSetOf<String>("Paris", "New York", "Tokyo")

fun main() {
    // Iterating through the mutable set using for loop
    for (place in placesOfWorld) {
        println(place)
    }

    // Iterating through the mutable set using forEach
    placesOfWorld.forEach { place ->
        println(place)
    }

    // Iterating through the mutable set using iterator
    val iterator = placesOfWorld.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // Iterating through the mutable set using forEachIndexed
    placesOfWorld.forEachIndexed { index, place ->
        println("Index: $index, Place: $place")
    }

    // Iterating through the mutable set using map
    val upperCasePlaces = placesOfWorld.map { it.uppercase() }
    println(upperCasePlaces)

    // Iterating through the mutable set using filter
    val filteredPlaces = placesOfWorld.filter { it.startsWith("P") }
    println(filteredPlaces)

    // Iterating through the mutable set using count
    val countPlaces = placesOfWorld.count { it.length > 5 }
    println("Count of places with more than 5 characters: $countPlaces")

    // Outputs:
    // Paris
    // New York
    // Tokyo
    // Paris
    // New York
    // Tokyo
    // Paris
    // New York
    // Tokyo
    // Index: 0, Place: Paris
    // Index: 1, Place: New York
    // Index: 2, Place: Tokyo
    // [PARIS, NEW YORK, TOKYO]
    // [Paris]
    // Count of places with more than 5 characters: 1
    // Note: The output may vary based on the initial contents of the mutable set.
}