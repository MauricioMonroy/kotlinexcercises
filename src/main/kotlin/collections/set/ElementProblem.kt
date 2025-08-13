package collections.set

fun elementProblem(first: Set<String>, second: MutableList<String>): Boolean {
    return first.containsAll(second)
}

fun main() {
    val set1 = readln().split(" ").toSet()
    val list2 = readln().split(" ").toMutableList()
    val result = elementProblem(set1, list2)
    println(result)
}