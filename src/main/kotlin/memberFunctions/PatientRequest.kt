package memberFunctions

class Patient(val name: String) {
    fun say() {
        println("Hello, my name is $name, I need a doctor.")
    }
}

fun main() {
    println("Please, enter your name:")
    val input = readln()
    val patient = Patient(input)
    patient.say() // Calling the member function say() on the Patient instance
}
