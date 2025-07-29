package loops

fun main() {
    val range1 = readln().toInt()
    val range2 = readln().toInt()
    var summarize = 0
    for (i in range1..range2) {
        summarize += i
    }
    println(summarize)
}