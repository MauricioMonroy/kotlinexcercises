package whenExpression

fun seasonOfTheYear(month: Int): String {
    return when (month) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Invalid month"
    }
}

fun main() {
    println("Enter the month number (1-12):")
    val month = readln().toInt()
    val season = seasonOfTheYear(month)
    println("The season is: $season")
}