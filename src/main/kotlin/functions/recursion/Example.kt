package functions.recursion

fun printStars(n: Int) {
    if (n < 1) return
    println("*")
    printStars(n - 1)
}

fun main() {
    val number = readln().toInt()
    printStars(number)
}

// This program defines a recursive function `printStars` that prints a specified number of stars, one per line.
// The function takes an integer `n` as input and prints a star if `n` is greater than 0.
// It then calls itself with `n - 1`, effectively reducing the problem size with each call until it reaches the base case of `n < 1`, at which point it stops the recursion.
// The `main` function reads an integer from the input and calls `printStars` with that integer.

//fun printStars(n: Int) {
//    print("*")
//    printStars(n - 1)
//}
// This commented-out version of the `printStars` function would lead to infinite recursion when `n` is less than 1,
// because there is no base case to stop the recursion. As a result, it would eventually cause a stack overflow error.