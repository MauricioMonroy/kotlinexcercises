package collections.set

fun resolution(first: Set<String>, second: Set<String>): Set<String> {
    val combinedSet = mutableSetOf<String>()
    combinedSet.addAll(first)
    combinedSet.addAll(second)
    return combinedSet
}

fun main() {
    val set1 = readln().split(" ").toSet()
    val set2 = readln().split(" ").toSet()
    val result = resolution(set1, set2)
    // printing the result without the commas
    println(result.joinToString(" "))
}