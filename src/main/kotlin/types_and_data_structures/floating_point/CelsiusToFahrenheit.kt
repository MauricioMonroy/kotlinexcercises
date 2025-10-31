package types_and_data_structures.floating_point

fun main() {
    val celsiusTemperature = readln().toDouble()
    val fahrenheitTemperature = celsiusTemperature * 1.8 + 32
    println(fahrenheitTemperature)
}