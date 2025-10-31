package types_and_data_structures.strings.substring

fun main() {
    val string = readln()
    val index = string.lastIndexOf('u')
    if (index == -1 || index == string.length - 1) {
        println(string)
    } else {
        val result = string.take(index + 1) + string.substring(index + 1).uppercase()
        println(result)
    }
}