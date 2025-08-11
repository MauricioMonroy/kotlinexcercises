package collections.map

fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {
    return map.containsKey(value) && map.containsValue(value)
}

fun main() {
    val keysAndValues = readln().split(',').map { it.trim() }
    val map = keysAndValues.associateWith { it }
    val valueToCheck = readln().trim()
    println(containsKeyAndValue(map, valueToCheck))
}