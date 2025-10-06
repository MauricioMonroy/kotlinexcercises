package strings.processing_strings

fun main() {
    val str = "Hello, Kotlin"
    var i = str.lastIndex
    while (i >= 1) {
        print(str[i]) // Output: niltoK ,olle
        i--
    }
}

// This code snippet demonstrates how to iterate through a string in reverse order,
// starting from the last character down to the second character, and print each character.
// The loop continues until it reaches the first character of the string.
// The output will be "niltoK ,olle" because it prints characters from the end to the beginning,
// excluding the first character 'H'.