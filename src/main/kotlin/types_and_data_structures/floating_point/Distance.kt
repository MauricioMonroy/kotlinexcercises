package types_and_data_structures.floating_point

fun main() {
    val miles = readln().toDouble()
    val travelTimeInHours = readln().toDouble()
    val averageSpeed = miles / travelTimeInHours
    println(averageSpeed)
}