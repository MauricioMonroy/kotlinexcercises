package collections

fun main() {
    // Checking the size on a List, a Set, and a Map
    val list = listOf("apple", "banana", "cherry")
    val set = setOf("apple", "banana", "cherry")
    val map = mapOf("a" to "apple", "b" to "banana", "c" to "cherry")
    println("List size: ${list.size}")
    println("Set size: ${set.size}")
    println("Map size: ${map.size}")

    // The method clear() only works on mutable collections
    // List are immutable, so we cannot clear them
    // Set are immutable, so we cannot clear them
    // Map are immutable, so we cannot clear them
    val mutableList = mutableListOf("apple", "banana", "cherry")
    val mutableSet = mutableSetOf("apple", "banana", "cherry")
    val mutableMap = mutableMapOf("a" to "apple", "b" to "banana", "c" to "cherry")
    mutableList.clear()



}