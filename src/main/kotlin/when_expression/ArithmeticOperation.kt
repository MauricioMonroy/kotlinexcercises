package when_expression

fun main() {
    println("Enter the operation (e.g., 25 * 8 or 25*8):")
    val input = readln().replace("\\s+".toRegex(), "")
    val regex = Regex("""(-?\d+(\.\d+)?)([+\-*/])(-?\d+(\.\d+)?)""")

    val match = regex.matchEntire(input)
    when (match) {
        null -> println("Error: Invalid input format. Use e.g., 25 * 8 or 25*8")
        else -> {
            val (var1, _, op, var2) = match.destructured
            try {
                val num1 = var1.toDouble()
                val num2 = var2.toDouble()
                val result = when (op) {
                    "+" -> num1 + num2
                    "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> if (num2 != 0.0) num1 / num2 else throw ArithmeticException("Division by zero")
                    else -> throw IllegalArgumentException("Unknown operation")
                }
                println(result)
            } catch (e: ArithmeticException) {
                println("Error: ${e.message}.")
            }
        }
    }
}