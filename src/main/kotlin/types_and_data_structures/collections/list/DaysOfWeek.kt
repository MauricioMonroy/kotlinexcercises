package types_and_data_structures.collections.list

fun daysOfWeek(): List<String> {
    return listOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )
}

fun main() {
    val daysOfWeek = daysOfWeek()
    println("Enter a number (0-6) to get the corresponding day of the week:")
    val input = readln().toInt()
    for (day in 1..input) {
        if (day in 0..6) {
            println(daysOfWeek[day])
        } else {
            println("Invalid input. Please enter a number between 0 and 6.")
            return
        }
    }
}
