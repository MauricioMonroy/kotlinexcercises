package types_and_data_structures.collections.map

fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    val validItems = shoppingList.filter { priceList.containsKey(it) }
    if (validItems.isEmpty()) return 0
    return validItems.sumOf { priceList[it] ?: 0 }
}

fun main() {
    val priceInput = readln()
    val priceList = priceInput.split(",").associate {
        val parts = it.trim().removePrefix("{").removeSuffix("}").split(" to ")
        parts[0] to parts[1].toInt()
    }

    val shoppingInput = readln()
    val shoppingList = shoppingInput.split(" ").map { it.trim() }.toMutableList()

    val totalBill = bill(priceList, shoppingList)
    println(totalBill)
}


