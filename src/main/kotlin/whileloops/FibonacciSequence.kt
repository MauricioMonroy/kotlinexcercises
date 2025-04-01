package whileloops

// import required libraries
import java.util.*

// main function
fun main(args: Array<String>) {
    print("Enter the number of terms: ")
    val scanner = Scanner(System.`in`)

    // take input
    val n = scanner.nextInt()

    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1 = 0
    var t2 = 1

    // Write your "while" loop code here to complete the series
    var count = 0
    while (count < n) {
        print(if (count == n - 1) "$t1" else "$t1, ") // print the current term
        val sum = t1 + t2 // calculate the next term
        t1 = t2 // update t1 to the next term
        t2 = sum // update t2 to the next term
        count++ // increment the count
    }
}

// Using for loop
//import java.util.Scanner
//
//fun main() {
//    print("Enter the number of terms: ")
//    val scanner = Scanner(System.`in`)
//    val n = scanner.nextInt()
//
//    var t1 = 0
//    var t2 = 1
//
//    for (i in 0 until n) {
//        print(if (i == n - 1) "$t1" else "$t1, ") // Avoid printing a comma after the last term
//        val sum = t1 + t2
//        t1 = t2
//        t2 = sum
//    }
//}
