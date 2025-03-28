package loops

fun main() {
    print("Enter a number: ")
    val n = readln().toInt()  // Reads the input and converts it to Int
    val tradeNumber = n / 2
    val result = "$tradeNumber$tradeNumber" // Concatenate the two numbers

    println(result)
}
