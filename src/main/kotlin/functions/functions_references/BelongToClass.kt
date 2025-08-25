package functions.functions_references

class Persona(val name: String, val lastName: String, val age: Int) {
    fun printPersonaInfo(): String {
        return ("Full name: $name $lastName | Age: $age")
    }
}

fun main() {
    val persona = Persona("Dmitry", "Max", 18)
    val personaFun: () -> String = persona::printPersonaInfo
    // We can print normal function or use the especial function invoke
    println(personaFun()) // Output: Full name: Dmitry Max | Age: 18
    println(personaFun.invoke()) // Output: Full name: Dmitry Max | Age: 18
    // Output: Full name: Dmitry Max | Age: 18
}