package loops

fun main() {
    val numberOfPrimeNumbersToPrint = readln().toInt()
    var count = 0
    var number = 2
    while (count < numberOfPrimeNumbersToPrint) {
        var isPrime = true
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println(number)
            count++
        }
        number++
    }
}