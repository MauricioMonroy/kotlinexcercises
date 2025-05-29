package ranges

fun main() {
    val numberToCheck = readln().toInt()
    val rangeStart = readln().toInt()
    val rangeEnd = readln().toInt()
    val isBetween = numberToCheck in rangeStart..rangeEnd
    println(isBetween)
}