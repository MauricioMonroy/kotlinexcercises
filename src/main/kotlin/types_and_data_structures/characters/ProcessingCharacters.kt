package types_and_data_structures.characters

fun main() {
    val one = '1'

    val isDigit = one.isDigit()   // true
    val isLetter = one.isLetter() // false

    val capital = 'A'
    val small = 'e'

    val isLetterOrDigit = capital.isLetterOrDigit() // true

    val isUpperCase = capital.isUpperCase() // true
    val isLowerCase = capital.isLowerCase() // false

    val capitalEString = small.uppercase() // "E"
    val capitalE = small.uppercaseChar()   // 'E'

    val smallAString = capital.lowercase() // "a"
    val smallA = capital.lowercaseChar()   // 'a'

    val isWhitespace = ' '.isWhitespace() // true

    println("Is digit: $isDigit")
    println("Is letter: $isLetter")
    println("Is letter or digit: $isLetterOrDigit")
    println("Is upper case: $isUpperCase")
    println("Is lower case: $isLowerCase")
    println("Capital E String: $capitalEString")
    println("Capital E: $capitalE")
    println("Small A String: $smallAString")
    println("Small A: $smallA")
    println("Is whitespace: $isWhitespace")
}