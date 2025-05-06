package loops

fun main() {
    // Collatz Conjecture
    // 1. If n is even, divide it by 2.
    // 2. If n is odd, multiply it by 3 and add 1.
    // 3. Repeat the process until n becomes 1.
    var n = readln().toInt()
    print("$n ")
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
        print("$n ")
    }
}