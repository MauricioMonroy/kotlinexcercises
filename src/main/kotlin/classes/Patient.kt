package classes

class Patient {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

fun main() {
    // Creating an instance of the Patient class
    val patient1 = Patient()
    // Setting properties
    patient1.name = "John Doe"
    patient1.age = 30
    patient1.height = 1.75

    val patient2 = Patient()
    // Setting properties
    patient2.name = "Jane Smith"
    patient2.age = 28
    patient2.height = 1.65

    // Printing properties
    println("Patient 1: Name: ${patient1.name} | Age: ${patient1.age} yrs | Height: ${patient1.height} m")
    println("Patient 2: Name: ${patient2.name} | Age: ${patient2.age} yrs | Height: ${patient2.height} m")

}