package collections.list.mutable_list

fun newList(numbers: List<Int>, number: Int): List<Int> {
    val newList = numbers.toMutableList()
    newList.add(number)
    return newList
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val number = readln().toInt()
    val result = newList(input, number)
    println(result.joinToString(" "))
}