package collections.list

fun main() {
    val numberOfElements = readln().toInt()
    val elements = List(numberOfElements) { readln().toInt() }
    println(elements.indexOf(elements.maxOrNull()))
}