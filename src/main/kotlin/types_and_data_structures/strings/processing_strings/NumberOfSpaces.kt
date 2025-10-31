package types_and_data_structures.strings.processing_strings

fun main() {
    val str = readln()
    var count = 0
    // Count spaces in the string
    for (char in str) {
        if (Character.isWhitespace(char))
            count++
    }
    println(count)

    // Print each character with its position
    for (index in str.indices) {
        println("${index + 1}: ${str[index]}")
    }

    // This converts the string to a CharArray, modifies it, and prints it
    val charArray: CharArray = str.toCharArray()
    for (i in charArray.indices) {
        if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i') {
            charArray[i] = '*' // Replace vowels with '*'
        }
    }
    println(String(charArray))
}