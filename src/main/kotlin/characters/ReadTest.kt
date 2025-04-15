package characters

fun main() {
    val input = readln()
    val charArray = input.toCharArray()
    var count = 0

    for (char in charArray) {
        if (char == 'a') {
            count++
        }
    }

    println("The letter 'a' appears $count times.")
}