package exceptions

fun convertStringToDouble(input: String): Double {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    try {
        return input.toDouble()
    } catch (e: NumberFormatException) {
        return 0.0
    }
    return input.toDouble()
}
fun main() {
    val input = readln()
    val result = convertStringToDouble(input)
    println("The result is: $result") // it will be printed
}