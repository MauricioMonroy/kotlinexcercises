package types_and_data_structures.strings.processing_strings

fun main() {
    val ticketNumber = readln()
    val firstHalfSum = ticketNumber.take(3).map { it.digitToInt() }.sum()
    val secondHalfSum = ticketNumber.substring(3, 6).map { it.digitToInt() }.sum()
    println(if (firstHalfSum == secondHalfSum) "Lucky" else "Regular")
}