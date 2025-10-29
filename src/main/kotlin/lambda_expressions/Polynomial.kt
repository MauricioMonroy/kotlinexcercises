package lambda_expressions

// This lambda expression calculates the value of a polynomial a * x^2 + b * x + c
// where a, b, and c are the coefficients of the polynomial and x is the variable.
// The lambda expression takes an integer x and returns the value of the polynomial.

fun main() {
    // Define the coefficients of the polynomial
    val a = 2
    val b = 3
    val c = 4

    // Define the polynomial as a lambda expression
    val polynomial: (Int) -> Int = { x -> a * x * x + b * x + c }

    // Test the polynomial with different values of x
    println(polynomial(1)) // Output: 9
    println(polynomial(2)) // Output: 18
    println(polynomial(3)) // Output: 31
}
