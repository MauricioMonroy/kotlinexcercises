package collections.set

fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    // Create a mutable set to hold the result of the subtraction
    val resultSet = mutableSetOf<Int>()

    // Subtract elements of numbers2 from numbers1
    for (number in numbers1) {
        if (number !in numbers2) {
            resultSet.add(number)
        }
    }

    // Return the size of the resulting set
    return resultSet.size
}

fun main() {
    val set1 = readln().split(" ").map { it.toInt() }.toSet()
    val set2 = readln().split(" ").map { it.toInt() }.toSet()
    val result = solution(set1, set2)
    println(result)
}