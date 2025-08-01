package collections.map

fun stringToMap(first: String, second: String, third: String): Map<String, Int> {
    return mapOf(
        first to first.length,
        second to second.length,
        third to third.length
    )
}

fun main() {
    val myMap = readln().split(" ")
    if (myMap.size < 3) {
        println("Please provide at least three strings.")
        return
    }
    val map = stringToMap(myMap[0], myMap[1], myMap[2])
    println(map)
}