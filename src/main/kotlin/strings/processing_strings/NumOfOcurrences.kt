package strings.processing_strings

fun main() {
    val inputString = readln()
    val checkingString = readln()
    val occurrences = inputString.windowed(checkingString.length).count { it == checkingString }
    println(occurrences)
}