package collections.map.mutable_map

fun makeWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    val filteredList = wishList.filterValues { it <= limit }
    return filteredList.toMutableMap()
}

fun main() {
    println("Enter your wish list (format: item: price, ...):")
    val wishList = readln()
        .split(",")
        .map { it.trim().split(": ") }
        .associate { it[0] to it[1].toInt() }
    println("Enter your budget limit:")
    val limit = readln().toInt()

    val affordableItems = makeWishList(wishList, limit)

    println("Items within your budget: $affordableItems")
}