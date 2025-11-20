package types_and_data_structures.collections.list.basic_lists

fun main() {
    // Copying a list
    val list = mutableListOf("A", "B", "C")
    val copy = list.toMutableList() // This function creates a new mutable list with the same elements as the original list
    print(copy) // [A, B, C]

    // Copying a list with a range
    val list2 = mutableListOf("A", "B", "C", "D", "E")
    val copy2 = list2.subList(1, 4) // This function creates a new mutable list with the elements from index 1 to index 4 (exclusive)
    print(copy2) // [B, C, D]
}