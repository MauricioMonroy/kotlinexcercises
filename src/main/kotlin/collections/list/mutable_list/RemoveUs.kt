package collections.list.mutable_list

fun removeUs(elements: MutableList<String>, index: Int): MutableList<String> {
    if (index in elements.indices) {
        elements.removeAt(index)
    } else {
        println("Index out of bounds")
    }
    return elements
}

fun main() {
    val inputElements = readln().split(" ")
    val elements = inputElements.toMutableList()
    val indexToRemove = readln().toIntOrNull() ?: -1
    val updatedList = removeUs(elements, indexToRemove)
    println(updatedList.joinToString(" "))
}