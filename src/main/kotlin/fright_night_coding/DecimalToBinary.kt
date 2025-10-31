package fright_night_coding

import java.math.BigInteger

fun main() {
    val decimal = readln().trim()
    val max32BitUnsigned = BigInteger("4294967295")
    var number = BigInteger(decimal)
    var overflows = 0
    while (number > max32BitUnsigned) {
        overflows++
        number -= max32BitUnsigned + BigInteger.ONE
    }
    println("$overflows,${number.toString(2)}")
}

// This code reads a decimal number from input,
// checks for overflows beyond the 32-bit unsigned integer limit,
// and converts the remaining part to binary.
// It prints the number of overflows and the binary representation of the remaining number.