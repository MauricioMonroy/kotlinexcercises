package functions.functions_references

// This reference has the following declaration:
// ::ClassName

class Person (val name: String){
}

val personGenerator: (String) -> Person = ::Person

val johnFoster: Person = personGenerator("John Foster")

fun main() = println(johnFoster.name) // Output: John Foster