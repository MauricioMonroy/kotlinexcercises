package types_and_data_structures.strings.processing_strings

fun main() {
    val data = readln().split("-").map { it.toInt() }
    val converted = "%02d/%02d/%04d".format(data[1], data[2], data[0])
    println(converted)
}