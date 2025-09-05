package collections.list

fun main() {
    val numberOfValues = readln().toInt()
    val values = mutableListOf<Int>()
    repeat(numberOfValues) {
        values.add(readln().toInt())
    }
    var tripleCount = 0
    for (i in 0..values.size - 3) {
        if (values[i + 1] == values[i] + 1 && values[i + 2] == values[i] + 2) {
            tripleCount++
        }
    }
    println(tripleCount)
}