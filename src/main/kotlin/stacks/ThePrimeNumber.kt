package stacks

import java.util.Scanner

fun printIfPrime(number: Int) {
    if (number < 2) {
        println("$number is not a prime number.")
        return
    }
    for (i in 2..kotlin.math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            println("$number is not a prime number.")
            return
        }
    }
    println("$number is a prime number.")
}

fun main(args: Array<String>) {
    val input = readln().toInt()
    printIfPrime(input)
}