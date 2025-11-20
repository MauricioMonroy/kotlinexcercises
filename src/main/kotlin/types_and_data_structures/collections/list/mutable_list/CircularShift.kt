package collections.list.mutable_list

fun main() {
    println("Enter the number of elements of the list:")
    val numberOfElements = readln().toInt()
    println("Enter the elements of the list, each on a new line:")
    val elements = MutableList(numberOfElements) { readln() }
    if (elements.isNotEmpty()) {
        val lastElement = elements.removeAt(elements.size - 1)
        elements.add(0, lastElement)
    }
    println(elements.joinToString(" "))
}


