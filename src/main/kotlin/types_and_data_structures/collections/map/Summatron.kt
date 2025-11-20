package types_and_data_structures.collections.map

fun summator(map: Map<Int, Int>): Int {
    val numbersToSum = map.filterKeys { it % 2 == 0 }
    if (numbersToSum.isEmpty()) return 0
    return numbersToSum.values.sum()
}

fun main() {
    val input = readln()
    val map = input.split(",").associate {
        val parts = it.trim().removePrefix("{").removeSuffix("}").split(" to ")
        parts[0].toInt() to parts[1].toInt()
    }
    println(summator(map))
}