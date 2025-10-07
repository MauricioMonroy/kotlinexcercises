package arrays

fun main() {
    val numbers = IntArray(3) // numbers: 0, 0, 0

    numbers[0] = 1 // numbers: 1, 0, 0
    numbers[1] = 2 // numbers: 1, 2, 0
    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

    println(numbers[0]) // 1, the first element
    println(numbers[2]) // 3, the last element
    // print all elements
    for (i in 0..2) {
        print("${numbers[i]} ")// 1 2 3
    }

    val last = numbers.size - 1
    println("\nLast element: ${numbers[last]}") // Last element: 3

    println(numbers.first()) // 1
    println(numbers.last())  // 3
    println(numbers.lastIndex) // 2
}