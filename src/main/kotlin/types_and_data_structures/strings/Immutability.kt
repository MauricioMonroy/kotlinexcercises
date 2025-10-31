package types_and_data_structures.strings

fun main() {
    // Immutable types_and_data_structures.strings
    val str = "Hello, Kotlin!"
    println("Original string: $str") // Hello, Kotlin!

    // Attempting to modify the string (this will not change the original string)
    val modifiedStr = str.replace("Kotlin", "Clarice")
    println("Modified string: $modifiedStr") // Hello, Clarice!
    println("Original string after modification attempt: $str") // Hello, Kotlin!

    // Strings are immutable in Kotlin
    // str[0] = 'h' // This will cause a compilation error

    // If you want to change the string, you can reassign it
    var mutableStr = "String"
    println("Mutable string: $mutableStr") // String
    mutableStr = "Mutable"
    println("Reassigned string: $mutableStr") // Mutable
}