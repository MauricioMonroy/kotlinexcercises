package lambda_expressions

// Where there a single parameter in a lambda expression, we can omit the parameter name and use 'it' instead.
// val originalText = "I don't know... what to say..."
// val textWithoutDots = originalText.filter { it != '.' }
// println(textWithoutDots) // I don't know what to say

// Returning from a lambda expression
// In Kotlin, we can use the 'return' keyword to return from a lambda expression.
// The return  from lambda would look like this:
fun main() {
    listOf(1, 2, 3).forEach {
        if (it == 2) return@forEach // This will skip the current iteration and continue with the next one
        println(it)
    }
    // Output:
    // 1
    println("End of forEach")
}

// Anonymous functions and lambdas
// fun(number: Int) = number.toString() // This is a lambda expression
// fun(number: Int): String { return number.toString() } // This is an anonymous function
// { number: Int -> number.toString() } // This is an anonymous function
