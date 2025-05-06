package lambdaExpressions

// This is a simple example of a lambda expression in Kotlin
// Structure: { arguments -> body }
fun main() {
    // A lambda expression that takes two integers and returns their sum
    val sum: (Int, Int) -> Int = { a, b -> a + b }

    // Using the lambda expression
    val result = sum(5, 10)
    println("The sum of 5 and 10 is: $result")
}