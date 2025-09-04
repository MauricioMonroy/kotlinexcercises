package ranges

fun main() {
    val totalNumbers = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(totalNumbers) {
        val number = readln().toInt()
        numbers.add(number)
    }
    println(numbers.minOrNull())
}