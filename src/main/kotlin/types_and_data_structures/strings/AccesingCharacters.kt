package types_and_data_structures.strings

fun main() {
    val str = "Hello, Kotlin!"
    println("First character: ${str[0]}") // H

    // printing last character
    println("Last character: ${str[str.length - 1]}") // !
    println(str.last()) // !
    val someText = "Testing"
    print(someText[someText.length - 1])

    println("Substring: ${str.substring(7, 12)}") // Kotlin

    // Empty string
    val emptyString = "word ."
    println(emptyString.length == 0) // true
    println("Is empty: ${emptyString.isEmpty()}") // true

    // Determine that contains at least 1 character
    println(emptyString.isNotEmpty()) // true
    println(emptyString.lastIndex >= 0) // true
    println(emptyString.length == 1) // false
    println(emptyString.length > 0) // true
}