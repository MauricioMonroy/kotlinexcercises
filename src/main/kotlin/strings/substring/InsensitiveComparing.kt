package strings.substring

fun main() {
    val firstCase = readln()
    val secondCase = readln()
    println(firstCase.equals(secondCase, ignoreCase = true))
}