package collections.list.mutable_list

fun main() {
    val elements = mutableListOf<String>()
    repeat(readln().toInt()) { elements.add(readln()) }
    val elementsToCheck = readln().split(" ")
    println(if (elementsToCheck.all { it in elements }) "YES" else "NO")
}