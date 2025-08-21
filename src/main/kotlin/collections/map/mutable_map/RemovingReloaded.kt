package collections.map.mutable_map

fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    return currentMap.filter { it.value != value }.toMap().toMutableMap()
}

fun main() {
    val currentMap = readln().split(", ").mapIndexed { index, value -> index to value }.toMap().toMutableMap()
    val valueToRemove = readln()
    val result = removing(currentMap, valueToRemove)
    println(result)
}