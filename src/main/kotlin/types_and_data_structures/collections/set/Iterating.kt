package types_and_data_structures.collections.set

val animals = setOf("Dog", "Cat", "Bird", "Fish")

fun main() {
    // Iterating over a set using forEach
    println("Iterating using forEach:")
    animals.forEach { animal ->
        println(animal)
    }

    // Iterating using a for loop
    println("\nIterating using a for loop:")
    for (animal in animals) {
        println(animal)
    }

    // Using an iterator to iterate through the set
    println("\nIterating using an iterator:")
    val iterator = animals.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}