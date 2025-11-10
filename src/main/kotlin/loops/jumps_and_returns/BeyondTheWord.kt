package loops.jumps_and_returns

fun main() {
    val input = readln().split(" ")
    val result = buildString {
        for (char in 'a'..'z') {
            if (input.any { it.contains(char, ignoreCase = true) }) {
                continue
            }
            append(char)
        }
    }
    println(result)
}
