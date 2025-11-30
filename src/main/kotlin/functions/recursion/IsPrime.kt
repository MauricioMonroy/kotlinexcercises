package functions.recursion

fun isPrime(number: Int, divisor: Int = 2): Boolean {
    for (i in number downTo 0) {
        if (number < 2) return false
        if (divisor * divisor > number) return true
        if (number % divisor == 0) return false
    }
    return isPrime(number, divisor + 1)
}

fun main() {
    val n = readln().toInt()
    println(isPrime(n))
}