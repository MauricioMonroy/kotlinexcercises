package types_and_data_structures.arrays.multi_dimensional_arrays

fun main() {
    val n = readln().toInt()
    var topLeft = ""
    var topRight = ""
    var bottomLeft = ""
    var bottomRight = ""
    for (i in 0 until n) {
        val cols = readln().split("\\s+".toRegex())
        if (i == 0) {
            topLeft = cols.first()
            topRight = cols.last()
        }
        if (i == n - 1) {
            bottomLeft = cols.first()
            bottomRight = cols.last()
        }
    }
    println("$topLeft $topRight")
    println("$bottomLeft $bottomRight")
}