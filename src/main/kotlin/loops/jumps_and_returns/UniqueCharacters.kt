package loops.jumps_and_returns

fun main() {
    val input = readln()
    while(true) {
        val uniqueChars = input.toSet().filter { char -> input.count { it == char } == 1 }
        println(uniqueChars.size)
        break
    }
}