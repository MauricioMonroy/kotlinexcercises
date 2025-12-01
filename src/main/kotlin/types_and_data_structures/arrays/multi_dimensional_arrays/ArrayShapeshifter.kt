package types_and_data_structures.arrays.multi_dimensional_arrays

fun main() {
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toTypedArray()
        inputArray += strings
    }
    val resultArray: Array<Array<String>> = arrayOf(inputArray.last(), inputArray.first())
    println(resultArray.contentDeepToString())
}