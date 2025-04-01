package whileloops

fun main() {
    var input = readln().toInt()
    var i = 0
    while (input != 0) {
        i += input
        input = readln().toInt()
    }
    println(i)
}