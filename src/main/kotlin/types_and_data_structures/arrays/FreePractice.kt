package types_and_data_structures.arrays

fun main() {
    println("Welcome to the statistics calculator!")
    println("You can enter a list of numbers, and I will compute some basic statistics for you.")
    println("Please enter the number of elements you want to input:")
    val sizeOfArray = readln().toInt()
    val numbers = IntArray(sizeOfArray)
    println("Please enter $sizeOfArray numbers:")
    for (i in 0..numbers.lastIndex) {
        numbers[i] = readln().toInt()
    }
    var sum = 0
    for (i in 0..numbers.lastIndex) {
        sum += numbers[i]
    }
    val average = sum.toDouble() / numbers.size
    println("The average is %.2f".format(average))

    val aboveAverageCount = numbers.count { it > average }
    println("The number of elements above the average: $aboveAverageCount")

    val belowAverageCount = numbers.count { it < average }
    println("The number of elements below the average: $belowAverageCount")

    val standardDeviation = kotlin.math.sqrt(
        numbers.sumOf {
            (it - average) * (it - average)
        } / numbers.size)
    println("The standard deviation is %.2f".format(standardDeviation))

    val leastCommonMultiple = kotlin.math.sqrt(
        numbers.sumOf {
            (it - average) * (it - average)
        } / numbers.size)
    println("The least common multiple is %.2f".format(leastCommonMultiple))

    println("\nThank you for using the statistics calculator!")
}