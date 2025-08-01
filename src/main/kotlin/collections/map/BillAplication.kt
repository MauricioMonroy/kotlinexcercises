package collections.map

fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    for (item in shoppingList) {
        if (priceList[item] == null) {
            return 0
        }
    }
    return shoppingList.sumOf { priceList[it] ?: 0 }
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


