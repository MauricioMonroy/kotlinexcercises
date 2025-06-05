package functionalDecomposition

fun subtractTwoNumbers(a: Long, b: Long): String {
    return if (b == 0L) {
        "Subtraction by 0!"
    } else {
        val result = a - b
        if (result < 0) {
            "-${-result}"
        } else {
            result.toString()
        }
    }
}

fun sumTwoNumbers(a: Long, b: Long): String {
    return if (b == 0L) {
        "Addition by 0!"
    } else {
        val result = a + b
        if (result < 0) {
            "-${-result}"
        } else {
            result.toString()
        }
    }
}

fun divideTwoNumbers(a: Long, b: Long): String {
    return if (b == 0L) {
        "Division by 0!"
    } else {
        (a / b).toString()
    }
}

fun multiplyTwoNumbers(a: Long, b: Long): String {
    return if (b == 0L) {
        "Multiplication by 0!"
    } else {
        val result = a * b
        if (result < 0) {
            "-${-result}"
        } else {
            result.toString()
        }
    }
}

fun main() {
    // read the operation such a + b, a - b, a * b, a / b
    val operation = readln().replace("\\s+".toRegex(), "")
    val regex = Regex("""(-?\d+)([+\-*/])(-?\d+)""")
    val match = regex.matchEntire(operation)

    when (match) {
        null -> println("Error: Invalid input format. Use e.g., 25 * 8 or 25*8")
        else -> {
            val (var1, op, var2) = match.destructured
            try {
                val num1 = var1.toLong()
                val num2 = var2.toLong()
                val result = when (op) {
                    "+" -> sumTwoNumbers(num1, num2)
                    "-" -> subtractTwoNumbers(num1, num2)
                    "*" -> multiplyTwoNumbers(num1, num2)
                    "/" -> divideTwoNumbers(num1, num2)
                    else -> throw IllegalArgumentException("Unknown operation")
                }
                println(result)
            } catch (e: IllegalArgumentException) {
                println("Error: ${e.message}.")
            }
        }
    }

}