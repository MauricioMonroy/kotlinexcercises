package types_and_data_structures.strings

fun main() {
    // Sum of types_and_data_structures.strings
    val str1 = "Hello"
    val str2 = "Mauricio"
    val blankString = " "
    val sum = str1 + blankString + str2
    println("Sum of types_and_data_structures.strings: $sum") // Hello Mauricio

    // String interpolation
    val name = "Mauricio"
    val age = 30
    val greeting = "Hello, my name is $name, and I am $age years old."
    println(greeting) // Hello, my name is Mauricio, and I am 30 years old.
}