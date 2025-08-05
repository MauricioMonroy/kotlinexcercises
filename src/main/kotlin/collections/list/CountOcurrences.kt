package collections.list

fun main() {
    val numberOfItems = readln().toInt()
    val items = mutableListOf<String>()
    for (i in 1..numberOfItems) {
        items.add(readln())
    }
    val numberToEvaluate = readln()
    val occurrences = items.count { it == numberToEvaluate }
    println(occurrences)
}
