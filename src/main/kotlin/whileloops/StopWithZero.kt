package whileloops

fun main() {
    do {
        print("Enter a number (0 to stop): ")
        val n = readln().toInt()
        println(n)
    } while (n > 0)
}

// This code reads an integer from the user and prints it. If the integer is greater than 0, it continues to read and print integers until a non-positive integer is entered.