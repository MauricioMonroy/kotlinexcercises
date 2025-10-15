package strings.processing_strings

fun main() {
    val input = readln()
    val sb = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            sb.append(input[i - 1]).append(count)
            count = 1
        }
    }
    sb.append(input.last()).append(count)
    println(sb)
}
