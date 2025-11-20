package types_and_data_structures.collections.list

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }
    val occurrences = mutableMapOf<Int, Int>()
    for (number in numbers) {
        if (occurrences.containsKey(number)) {
            println(number)
            return
        }
        occurrences[number] = 1
    }
    println(-1)
}