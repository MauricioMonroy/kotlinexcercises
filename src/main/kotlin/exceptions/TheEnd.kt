package exceptions

fun solution() {
    val a = readln().toInt()
    val b = readln().toInt()
    try {
        val operation = a / b
        println(operation)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}

fun main() {
    solution()
    // Uncomment the line below to test with a different input
    // solution()
}