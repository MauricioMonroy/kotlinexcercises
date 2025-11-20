package types_and_data_structures.collections.set

fun conversion(strings: MutableList<String>): Set<String> {
    return strings.toSet()
}

fun main() {
    val inputStrings = readln().split(" ")
    val resultSet = conversion(inputStrings.toMutableList())
    println(resultSet.joinToString(" "))
}