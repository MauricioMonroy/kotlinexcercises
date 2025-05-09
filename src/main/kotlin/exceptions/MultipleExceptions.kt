package exceptions

// Kotlin supports the use of several handlers in a single try-catch statement.
// This allows you to handle different types of exceptions in a single try block.
// You can use multiple catch blocks to handle different exceptions separately.
// The order of the catch blocks is important; the most specific exceptions should be caught first,
// followed by the more general exceptions.
fun main() {
    println("Before the try-catch block") // it will be printed
    try {
        println("Inside the try block before an exception") // it will be printed
        println(2 / 0) // it throws ArithmeticException
        println("Inside the try block after the exception") // it won't be printed
    } catch (e: ArithmeticException) {
        println("Division by zero!") // it will be printed
        println(e.message) // This prints the message of the exception: / by zero
    } catch (e: Exception) {
        println("An error occurred: ${e.message}") // it won't be printed
    }
    println("After the try-catch block") // it will be printed
}

// Example with 'RuntimeException' and 'IllegalArgumentException'
fun example() {
    println("Before the try-catch block") // it will be printed
    try {
        println("Inside the try block before an exception") // it will be printed
        println(2 / 0) // it throws ArithmeticException
        println("Inside the try block after the exception") // it won't be printed
    } catch (e: RuntimeException) {
        println("Runtime exception occurred!") // it won't be printed
    } catch (e: IllegalArgumentException) {
        println("Illegal argument exception occurred!") // it won't be printed
    } catch (e: Exception) {
        println("An error occurred: ${e.message}") // it won't be printed
    }
    println("After the try-catch block") // it will be printed
}