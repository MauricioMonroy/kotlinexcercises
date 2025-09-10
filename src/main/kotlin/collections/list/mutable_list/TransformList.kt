package collections.list.mutable_list

fun transformList(numbersString: String): String {
    val numbers = numbersString.split(',').map { it.toInt() }.toMutableList()
    for (i in numbers.indices) {
        numbers[i] = if (numbers[i] % 2 == 0) {
            numbers[i] / 2
        } else {
            numbers[i] * 2
        }
    }
    return numbers.joinToString(",")
}

fun main() {
    println("Enter numbers separated by commas:")
    val input = readln()
    val result = transformList(input)
    println(result)
}