package loops.jumps_and_returns

import kotlin.math.sqrt

fun main() {
    println("Enter a positive integer:")
    // Print the number of prime numbers and the last prime number less than or equal to the given integer.
    val n = readln().toInt()
    var count = 0
    var lastPrime = -1
    for (i in 2..n) {
        var isPrime = true
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            count++
            lastPrime = i
        }
    }
    println("Number of prime numbers less than or equal to $n: $count")
    println("The last prime number less than or equal to $n: $lastPrime")
}
