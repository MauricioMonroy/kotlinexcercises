package functions.named_arguments

fun sum(a: Int = 1, b: Int = 2, c: Int = 3, d: Int = 4) = a + b + c + d

fun main() {
    println(sum(5, b = 3, d = 2))
}