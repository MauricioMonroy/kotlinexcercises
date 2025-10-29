package when_expression

fun main() {
    val n = readln()
    val stringToNumber = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )
    when (val number = stringToNumber[n]) {
        null -> println("Number out of range")
        else -> println(number)
    }
}