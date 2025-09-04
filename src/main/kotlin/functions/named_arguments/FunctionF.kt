package functions.named_arguments

fun f(a: Int, b: Int, c: Int) = a + b + c

fun main() {
    println(f(a = 10, c = 12, b = 11)) // Output: 33
    println(f(a = 10, b = 11, 12)) // Output: 33
    println(f(10, 11, c = 12)) // Output: 33
    println(f(10, b = 11, 12)) // Output: 33
}