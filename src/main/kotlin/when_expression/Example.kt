package when_expression

fun main() {
    // Arithmetic operations with when expression
    println("Enter two integers (a, b):")
    val a = readln().toInt()
    val b = readln().toInt()

    // Using when expression to perform arithmetic operations
    val result = when {
        a > b -> a + b
        a < b -> a - b
        else -> a * b
    }

    println("Result of the operation: $result")

    // Using when expression to determine the type of operation performed
    val operationType = when {
        a > b -> "Addition"
        a < b -> "Subtraction"
        else -> "Multiplication"
    }

    println("Operation performed: $operationType")
}