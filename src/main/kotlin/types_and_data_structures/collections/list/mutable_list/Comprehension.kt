package types_and_data_structures.collections.list.mutable_list

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 1, 5, 1)
    numbers.add(1)
    numbers.remove(1)
    println(numbers) // [2, 3, 4, 1, 5, 1, 1]
}