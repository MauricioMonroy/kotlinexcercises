package types_and_data_structures.collections.set.mutable_set

fun combination(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val combinedSet = setOf<String>().toMutableSet()
    combinedSet.addAll(setSource)
    combinedSet.addAll(listSource)
    return combinedSet
}

fun main() {
    val setSource = readln().split(" ").toSet()
    val listSource = readln().split(" ").toMutableList()
    val result = combination(setSource, listSource)
    // printing the result without the commas
    println(result.joinToString(" "))
}