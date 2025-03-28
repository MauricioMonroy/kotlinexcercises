package loops

fun main() {
    print("Enter a number: ")
    val n = readln().toInt()  // Reads the input and converts it to Int

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
        // Print a pyramid of asterisks with the dimension of the number entered by the user
    }
}
