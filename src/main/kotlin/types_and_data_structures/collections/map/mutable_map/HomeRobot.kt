package types_and_data_structures.collections.map.mutable_map

fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    val combinedPurchases = purchases.toMutableMap()
    for ((item, quantity) in addition) {
        combinedPurchases[item] = combinedPurchases.getOrDefault(item, 0) + quantity
    }
    return combinedPurchases
}

fun main() {
    println("Enter the initial purchases (format: item: quantity, ...):")
    val purchases = readln()
        .split(",")
        .map { it.trim().split(": ") }
        .associate { it[0] to it[1].toInt() }
    println("Enter the additional purchases (format: item: quantity, ...):")
    val addition = readln()
        .split(",")
        .map { it.trim().split(": ") }
        .associate { it[0] to it[1].toInt() }

    val updatedPurchases = helpingTheRobot(purchases, addition)

    println("Total purchases: $updatedPurchases")
}