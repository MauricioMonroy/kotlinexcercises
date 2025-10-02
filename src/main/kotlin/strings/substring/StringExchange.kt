package strings.substring

fun main() {
    val word = readln()
    val result = if (word.length > 2) {
        word.last() + word.substring(1, word.length - 1) + word.first()
    } else {
        word.reversed()
    }
    println(result)
}
