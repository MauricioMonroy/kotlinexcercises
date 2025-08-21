package classes.memberFunctions

class Counter(var value: Int) {
    fun increment() {
        ++value
    }
}

fun main() {
    // val counter = Counter() // This line would cause an error because the primary constructor requires an Int argument.
    val counter2 = Counter(1) // This is valid because we provide an initial value of 1.
    // Counter().increment() // This line would cause an error because the primary constructor requires an Int argument.
    // Counter().increment(1) // This line would cause an error because the primary constructor requires an Int argument.
    Counter(1).increment() // This is valid because we provide an initial value of 1 and then call the increment function.
    // Counter(1).increment(1) // This line would cause an error because the increment function does not take any parameters.
}