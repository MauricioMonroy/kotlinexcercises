package collections.list

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }

    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println(sum) // This sums all elements correctly

    var sum2 = 0
    for (i in numbers.indices) {
        sum2 += i
    }
    println(sum2) // This can not sum the elements, it sums the indices instead

    var sum3 = 0
    for (i in 1 until numbers.size) {
        sum3 += numbers[i]
    }
    println(sum3) // This can not sum the first element, it should start from index 0

    var sum4 = 0
    for (i in numbers.lastIndex downTo 0) {
        sum4 += numbers[i]
    }
    println(sum4) // This sums all elements correctly, but in reverse order
}