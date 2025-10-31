package types_and_data_structures.characters

fun main() {
    val input = readln()
    val charArray = input.toCharArray()
    var sum = 0

    for (char in charArray) {
        sum += char.code
    }

    println("The sum of the character codes is $sum.")
}