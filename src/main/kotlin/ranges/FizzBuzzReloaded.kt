package ranges

fun main() {
    val initialRange = readln().toInt()
    val finalRange = readln().toInt()
    for (i in initialRange..finalRange) {
        println(
            when {
                i % 15 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> "$i"
            }
        )
    }
}