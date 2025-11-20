package types_and_data_structures.collections.list

fun processGroceries(groceries: MutableList<String>) {
    groceries.reverse()
    for ((index, item) in groceries.withIndex()) {
        if (!item.startsWith('A')) {
            println("$index: $item")
        }
    }
}

fun main() {
    val groceries = mutableListOf("Apple", "Banana", "Avocado", "Orange", "Grapes")
    processGroceries(groceries)
}