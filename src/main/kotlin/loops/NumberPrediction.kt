package loops

// Predict the next number in the series
fun main() {
    println("Enter numbers separated by space:")
    val numbers = readln().split(' ').map { it.toInt() }.toList()
    if (numbers.size < 2) {
        println("0")
        return
    }
    val difference = numbers[1] - numbers[0]
    for (i in 1 until numbers.size - 1) {
        if (numbers[i + 1] - numbers[i] != difference) {
            println("0")
            return
        }
    }
    println(numbers.last() + difference)
}