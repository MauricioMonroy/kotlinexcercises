fun main() {
    print("Enter a number: ")
    val n = readln().toInt()  // Reads the input and converts it to Int
    var result = " " // Variable to store the output

    repeat(n) {
        result += n.toString() // Concatenate `n` in each iteration
    }

    println(result) // Print the final result
}