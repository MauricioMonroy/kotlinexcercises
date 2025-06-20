package ranges

fun main() {
    val input = readln().toInt()
    if (input in 10..200) {
        println("In range")
    } else {
        println("Not in range")
    }
}