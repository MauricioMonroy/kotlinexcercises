package types_and_data_structures.collections.set

fun findByIndex(names: Set<String>): String {
    val namesList = names.toList()
    val aliceIndex = namesList.indexOf("Alice")
    val victorIndex = namesList.indexOf("Victor")
    return "$aliceIndex, $victorIndex"
}

fun main() {
    val inputNames = readln().split(", ").toSet()
    val result = findByIndex(inputNames)
    println(result)
}

