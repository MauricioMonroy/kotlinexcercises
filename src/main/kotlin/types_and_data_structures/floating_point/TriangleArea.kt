package types_and_data_structures.floating_point

import java.util.Locale
import kotlin.math.sqrt

fun main() {
    val base = readln().format(Locale.ROOT).toFloat() // 'Locale.ROOT' to ensure dot as decimal separator
    val height = readln().toDouble()
    val area = 0.5 * base * height
    println(area)
}
