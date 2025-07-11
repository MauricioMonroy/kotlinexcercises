package namedArguments

import kotlin.math.pow

fun finalAmount(startingAmount: Int = 1000, yearlyPercent: Int = 5, years: Int = 10): Int {
    val compoundInterest =
        (startingAmount.toDouble() * (1 + yearlyPercent.toDouble() / 100.00).pow(years.toDouble())).toInt()
    return compoundInterest
}

fun main() {
    // This input specifies the operation: amount, percent, or years.
    val selectedOperation = readln().lowercase()
    // This input specifies the value for the operation.
    val inputValue = readln().toIntOrNull() ?: 0
    when (selectedOperation) {
        "amount" -> println(finalAmount(startingAmount = inputValue))
        "percent" -> println(finalAmount(yearlyPercent = inputValue))
        "years" -> println(finalAmount(years = inputValue))
        else -> println("Invalid operation. Please enter 'amount', 'percent', or 'years'.")
    }
}