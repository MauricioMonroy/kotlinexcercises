package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    var sum1 = 0
    for (num in numbers) {
        sum1 += num
    }

//    for (i in numbers.indexes) {
//        sum += i
//    }
// This line is commented out because 'indexes' is not a valid property in Kotlin

    var sum2 = 0
    for (i in 1..numbers.size - 1) {
        sum2 += numbers[i]
    }
    // This does not include the first element (index 0), so sum2 will be different from sum1

    var sum3 = 0
    for (i in numbers.lastIndex downTo 0) {
        sum3 += numbers[i]
    }

    println("Total Sum: $sum1")
    println("Total Sum: $sum2")
    println("Total Sum: $sum3")
}