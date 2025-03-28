package loops

fun parseCardNumber(cardNumber: String?): Long {
    requireNotNull(cardNumber) { "Card number cannot be null" }

    // Regular expression to match the format "AAAA AAAA AAAA AAAA"
    val pattern = Regex("\\d{4} \\d{4} \\d{4} \\d{4}")
    require(cardNumber.matches(pattern)) { "Incorrect card number format: $cardNumber" }

    // Remove spaces to get only digits
    val numeric = cardNumber.replace(" ", "")

    // Convert to Long
    return numeric.toLong()
}

fun main() {
    val testCases = listOf(
        "1234 5678 9012 3456",  // Valid
        "1234567890123456",      // Invalid (missing spaces)
        "1234 567 890 3456",     // Invalid (wrong grouping)
        "abcd 5678 9012 3456",   // Invalid (non-numeric)
        "1234 5678 9012 34567",  // Invalid (too many digits)
        null                     // Invalid (null input)
    )

    for (testCase in testCases) {
        try {
            val result = parseCardNumber(testCase)
            println("Parsed card number: $result")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        } catch (e: NumberFormatException) {
            println("Error: Invalid number format")
        }
    }
}
