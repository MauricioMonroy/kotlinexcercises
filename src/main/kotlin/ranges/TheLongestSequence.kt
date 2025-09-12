package ranges

fun main() {
    println("Enter the number of values followed by the values themselves separated by new lines:")
    val totalNumbers = readln().toInt()
    val numbers = List(totalNumbers) { readln().toInt() }
    var maxLength = 1
    var currentLength = 1
    for (i in 1 until numbers.size) {
        if (numbers[i] >= numbers[i - 1]) {
            currentLength++
            maxLength = maxOf(maxLength, currentLength)
        } else {
            currentLength = 1
        }
    }
    println(maxLength)
}
