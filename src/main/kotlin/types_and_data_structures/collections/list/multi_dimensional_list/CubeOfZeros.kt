package types_and_data_structures.collections.list.multi_dimensional_list

fun main() {
    val size = 3
    val cube = MutableList(size) { MutableList(size) { MutableList(size) { 0 } } }
    println(cube)
}