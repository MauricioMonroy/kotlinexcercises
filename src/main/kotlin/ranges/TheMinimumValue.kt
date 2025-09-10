package ranges

fun main() {
    println("Enter the number of values followed by the values themselves separated by new lines:")
    val totalNumbers = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(totalNumbers) {
        val number = readln().toInt()
        numbers.add(number)
    }
    println(numbers.minOrNull())
}