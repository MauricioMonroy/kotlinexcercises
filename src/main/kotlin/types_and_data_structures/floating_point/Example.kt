package types_and_data_structures.floating_point

fun main() {
    val number = 3.14F
    println("The number is $number")
    operationsOnFloats()

    val a = 8.0
    val b = 5.0
    val c = a / b + 1.1
    println("Result of the operation is $c")
}

fun operationsOnFloats() {
    println("Enter two floating-point numbers:")
    val nmb1 = readln().toFloat()
    val nmb2 = readln().toFloat()
    println("Sum: ${nmb1 + nmb2}")
    println("Difference: ${nmb1 - nmb2}")
    println("Product: ${nmb1 * nmb2}")
    if (nmb2 != 0.0F) {
        println("Quotient: ${nmb1 / nmb2}")
    } else {
        println("Quotient: Division by zero is not allowed.")
    }
}