package memberFunctions

class ArithmeticOperations(val x: Int, val y: Int) {
    fun addition(): Int {
        return x + y
    }
    fun subtraction(): Int {
        return x - y
    }
    fun multiplication(): Int {
        return x * y
    }
    fun division(): Int {
        if (y == 0) {
            throw IllegalArgumentException("Division by zero is not allowed")
        }
        return x / y
    }
}

fun main() {
    println("Enter two integers:")
    val input = readln().split(" ")
    println("Enter the operation (add, subtract, multiply, divide):")
    val operation = readln().lowercase()
    val x =input[0].toInt()
    val y = input[1].toInt()
    val arithmetic = ArithmeticOperations(x, y)

    when (operation) {
        "add" -> println("Result: ${arithmetic.addition()}")
        "subtract" -> println("Result: ${arithmetic.subtraction()}")
        "multiply" -> println("Result: ${arithmetic.multiplication()}")
        "divide" -> {
            try {
                println("Result: ${arithmetic.division()}")
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        else -> println("Invalid operation")
    }
}