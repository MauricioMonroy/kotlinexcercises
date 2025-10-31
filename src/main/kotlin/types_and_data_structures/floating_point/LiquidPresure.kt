package types_and_data_structures.floating_point

const val G = 9.8

fun main() {
    val fluidDensity = readln().toDouble()
    val heightLiquidColumn = readln().toDouble()
    val liquidPressure = fluidDensity * G * heightLiquidColumn
    println(liquidPressure)
}