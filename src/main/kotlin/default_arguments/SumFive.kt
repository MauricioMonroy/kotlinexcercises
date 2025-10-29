package default_arguments

fun sum5(a1: Int = 0, a2: Int = 0, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int {
    return a1 + a2 + a3 + a4 + a5
}

fun main() {
    println("Enter up to 5 integers separated by spaces (default is 0 for missing values):")
    val input = readln()
    val numbers = input.split(" ").map { it.toInt() }
    val result = sum5(
        numbers.getOrNull(0) ?: 0,
        numbers.getOrNull(1) ?: 0,
        numbers.getOrNull(2) ?: 0,
        numbers.getOrNull(3) ?: 0,
        numbers.getOrNull(4) ?: 0
    )
    println(result)
}