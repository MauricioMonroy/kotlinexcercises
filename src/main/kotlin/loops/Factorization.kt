package loops

fun main() {
    println("Enter a number to factorize:")
    var n = readln().toInt()
    var i = 2
    while (i <= n) {
        if (n % i == 0) {
            println("$i ")
            n /= i
        } else {
            i++
        }
    }
}
