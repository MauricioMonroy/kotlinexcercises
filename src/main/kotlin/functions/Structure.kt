package functions

// Syntax for defining a function type
// (parameters' types) -> return value type
// Example: (Int, Int) -> Int
fun sum(a: Int, b: Int): Int = a + b
// Example () -> Unit
fun sayHello() {
    println("Hello")
}

// Function reference
val sumObject = ::sum // Function reference
val sayHello: () -> Unit = ::sayHello // Function reference
