package collections.list.mutable_list

fun addingAllInputElements(first: List<Int>, second: List<Int>): MutableList<Int> =
    (first + second).toMutableList()

fun main() {
    val firstInput = readln().split(" ").map { it.toInt() }
    val secondInput = readln().split(" ").map { it.toInt() }
    val result = addingAllInputElements(firstInput, secondInput)
    println(result.joinToString(" "))
}