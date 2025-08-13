package collections.set

fun main() {
    val listOfEmployees = setOf<String>("John", "Mike", "Anastasia") // immutable set
    // listOfEmployees[1] = "Alexa" // This line will cause an error because sets are immutable
    println(listOfEmployees)
    // Output: [John, Mike, Anastasia]

    // To add elements, we need to create a new set or use a mutable set
    val employeesFromOregon = setOf("Alexa")
    val groupOfEmployees = listOfEmployees + employeesFromOregon // combine sets
    println(groupOfEmployees) // Output: [John, Mike, Anastasia, Alexa]
}