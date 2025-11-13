package functions.recursion

fun factorialRecursive(n: Int): Int {
    if (n == 0 || n == 1) return 1
    return n * factorialRecursive(n - 1)
}

fun main() {
    val number = readln().toInt()
    val result = factorialRecursive(number)
    println(result)
}
// This program defines a recursive function `factorialRecursive` that calculates the factorial of a given non-negative integer `n`.
// The function checks if `n` is 0 or 1, in which case it returns 1 (the base case).
// For any other positive integer, it returns `n` multiplied by the factorial of `n - 1`, effectively reducing the problem size with each call until it reaches the base case.
// The `main` function reads an integer from the input, calls `factorialRecursive` with that integer, and prints the result.