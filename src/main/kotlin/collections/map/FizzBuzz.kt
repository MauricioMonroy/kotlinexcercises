package collections.map

fun iterator(map: Map<String, Int>) {
    for ((_, value) in map) {
        when {
            value % 3 == 0 -> println("Fizz")
            value % 5 == 0 -> println("Buzz")
            else -> println("FizzBuzz")
        }
    }
}

fun main() {
    println("Enter the number of key-value pairs:")
    val n = readln().toInt()
    val map = mutableMapOf<String, Int>()
    for (i in 1..n) {
        println("Enter key and value (space-separated):")
        val keyValue = readln().split(" ")
        map[keyValue[0]] = keyValue[1].toInt()
    }
    iterator(map)
}
