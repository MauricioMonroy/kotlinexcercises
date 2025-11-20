package types_and_data_structures.collections.list.mutable_list

fun main() {
    val numbers = mutableListOf<Int>()
    repeat(readln().toInt()) { numbers.add(readln().toInt()) }
    val isAscending = numbers.zipWithNext().all { (a, b) -> a <= b }
    println(if (isAscending) "YES" else "NO")
}