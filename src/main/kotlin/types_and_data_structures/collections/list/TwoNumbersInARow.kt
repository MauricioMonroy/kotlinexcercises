package types_and_data_structures.collections.list

fun main() {
    println("Enter the number of values followed by the values themselves separated by new lines:")
    val numberOfValues = readln().toInt()
    val values = List(numberOfValues) { readln().toInt() }
    val (a, b) = readln().split(" ").map { it.toInt() }
    if (values.zipWithNext().any { (x, y) -> (x == a && y == b) || (x == b && y == a) }) {
        println("NO")
    } else {
        println("YES")
    }
}