package defaultArguments

fun tip(bill: Int, percentage: Int = 10): Int {
    return (bill * percentage) / 100
}

fun main() {
    println("Enter the bill amount and tip percentage (default is 10%):")
    val input = readln()
    val calculate = input.split(" ").map { it.toInt() }
    val result = tip(
        calculate.getOrNull(0) ?: 0,
        calculate.getOrNull(1) ?: 0,
    )

    println(result)
}