package types_and_data_structures.collections.list

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (element in numbers) {
        println(element)
    }
    for (i in numbers.indices) {
        println(i)
    }
    for (i in 1..numbers.size) {
        //println(numbers[i])
    }
    for (i in numbers.indices) {
        println(numbers[i])
    }
}