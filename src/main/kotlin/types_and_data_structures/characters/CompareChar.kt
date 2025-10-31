package types_and_data_structures.characters

fun main() {
    val char1 = 'K'
    val char2 = '\u004B'

    // Comparing hardcoded char with its Unicode value
    if (char1 == char2) {
        println("The types_and_data_structures.characters are equal.")
    } else {
        println("The types_and_data_structures.characters are not equal.")
    }

}