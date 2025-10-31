package types_and_data_structures.strings

fun main() {
    val input = readln()
    if (input.isEmpty()) {
        println("")
        return
    }
    val firstSymbol = input.first()
    when (firstSymbol) {
        'i' -> {
            val numberPart = input.drop(1)
            try {
                println(numberPart.toInt() + 1)
            } catch (e: NumberFormatException) {
                println(input)
            }
        }

        's' -> {
            println(input.drop(1).reversed())
        }

        else -> {
            println(input)
        }
    }
}

// This program reads a string from the input and processes it based on its first character:
// - If the string starts with 'i', it treats the rest of the string as an integer, increments it by 1, and prints the result. If the rest of the string is not a valid integer, it prints the original string.
// - If the string starts with 's', it treats the rest of the string as a regular string, reverses it, and prints the reversed string.
// - If the string starts with any other character, it prints the original string unchanged.
// Example:
// Input: "i123"
// Output: "124"
// Input: "shello"
// Output: "olleh"
// Input: "xabc"
// Output: "xabc"