package exceptions

fun printFifthCharacter(input: String): String {
    try {
        if (input.length < 5) {
            throw IllegalArgumentException("The input word is too short!")
        }
    } catch (e: IllegalArgumentException) {
        return e.message.toString()
    }
    return "The fifth character of the entered word is ${input[4]}"
}

fun main() {
    println("Enter a word:")
    val input = readln()
    println(printFifthCharacter(input))
}