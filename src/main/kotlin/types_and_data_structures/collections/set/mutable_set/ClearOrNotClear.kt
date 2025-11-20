package types_and_data_structures.collections.set.mutable_set

fun isThereInTheSet(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    if (elements.contains(element)) {
        elements.clear()
    }
    return elements
}

fun main() {
    val inputSet = readln().split(" ").map { it.toInt() }.toMutableSet()
    val elementToCheck = readln().toInt()
    val resultSet = isThereInTheSet(inputSet, elementToCheck)
    // printing the result without the commas
    println(resultSet.joinToString(" "))
}