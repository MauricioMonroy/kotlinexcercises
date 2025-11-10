package functions.scopes

fun main() {
    val outerVariable = "I'm outside!"

    fun innerFunction() {
        val innerVariable = "I'm inside!"
        println(outerVariable) // Accessing outer variable
        println(innerVariable) // Accessing inner variable
    }

    innerFunction()
    // println(innerVariable) // This would cause an error: Unresolved reference: innerVariable
}

// It is no possible to access innerVariable from the outer scope, demonstrating scope rules in Kotlin.
// The innerFunction can access outerVariable, but the main function cannot access innerVariable.
// This illustrates how nested functions can access variables from their enclosing scope, but not vice versa.