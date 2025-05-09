package exceptions

// This is a simple arithmetic exception template that can be used to handle arithmetic errors in Kotlin.
// It includes a try block where you can place your code that might throw an exception,
// and a catch block where you can handle the exception.
fun main() {
    println("Before the try-catch block") // it will be printed
    try {
        println("Inside the try block before an exception") // it will be printed
        println(2 / 0) // it throws ArithmeticException
        println("Inside the try block after the exception") // it won't be printed
    } catch (e: ArithmeticException) {
        println("Division by zero!") // it will be printed
        println(e.message) // This prints the message of the exception: / by zero
    }

    println("After the try-catch block") // it will be printed
}

// Note: The variables announced in the try block are not accessible in the catch block or outside the try-catch block.